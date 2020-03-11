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
}
