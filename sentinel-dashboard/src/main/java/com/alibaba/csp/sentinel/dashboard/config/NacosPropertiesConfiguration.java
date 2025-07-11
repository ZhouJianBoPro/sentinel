package com.alibaba.csp.sentinel.dashboard.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc:
 * @Author: zhoujianbo
 * @Version: 1.0
 * @Date: 2025/7/10 17:02
 **/
@Configuration
@ConfigurationProperties(prefix = "sentinel.nacos")
public class NacosPropertiesConfiguration {

    private String serverAddr;
    private String namespace;
    private String username;
    private String password;

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
