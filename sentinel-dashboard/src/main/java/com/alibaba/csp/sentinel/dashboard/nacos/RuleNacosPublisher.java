/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.dashboard.nacos;

import com.alibaba.csp.sentinel.dashboard.enums.RuleTypeEnum;
import com.alibaba.csp.sentinel.util.AssertUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.ConfigType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Eric Zhao
 * @since 1.4.0
 */
@Component
public class RuleNacosPublisher {

    private static final String GROUP_ID = "SENTINEL_GROUP";

    @Autowired
    private ConfigService configService;

    public <T> void publish(String app, RuleTypeEnum ruleType, List<T> rules) throws Exception {

        AssertUtil.notEmpty(app, "app name cannot be empty");
        if (CollectionUtils.isEmpty(rules)) {
            return;
        }

        String dataId = app + "-" + ruleType.getType();
        String dataContent = JSON.toJSONString(rules);
        configService.publishConfig(dataId, GROUP_ID, dataContent, ConfigType.JSON.getType());
    }
}
