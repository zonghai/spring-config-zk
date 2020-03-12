package com.leaner.config.zookeeper;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @desc 可以获取zookeeper的数据 加了RefreshScope后就为空
 * @auth 十三先生
 * @date 2020-03-10
 */
@Component
@ConfigurationProperties(prefix = "ftp")
public class DynamicProperty {
    public String ip;
    public Integer port;
    private String testValue;
    private Boolean testBool;
    private Boolean testBool2;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getTestValue() {
        return testValue;
    }

    public void setTestValue(String testValue) {
        this.testValue = testValue;
    }

    public Boolean getTestBool() {
        return testBool;
    }

    public void setTestBool(Boolean testBool) {
        this.testBool = testBool;
    }

    public Boolean getTestBool2() {
        return testBool2;
    }

    public void setTestBool2(Boolean testBool2) {
        this.testBool2 = testBool2;
    }
}
