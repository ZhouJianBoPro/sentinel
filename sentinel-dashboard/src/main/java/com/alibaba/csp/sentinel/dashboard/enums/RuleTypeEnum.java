package com.alibaba.csp.sentinel.dashboard.enums;

/**
 * @Desc:
 * @Author: zhoujianbo
 * @Version: 1.0
 * @Date: 2025/7/11 11:22
 **/
public enum RuleTypeEnum {

    FLOW("flow"),
    DEGRADE("degrade"),
    PARAM_FLOW("param-flow"),
    SYSTEM("system"),
    AUTHORITY("authority"),
    GW_FLOW("gw-flow"),
    GW_API_GROUP("gw-api-group");

    private String type;

    RuleTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
