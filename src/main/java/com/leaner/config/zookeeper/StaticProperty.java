package com.leaner.config.zookeeper;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @desc
 * @auth 十三先生
 * @date 2020-03-10
 */
@Component
public class StaticProperty {
    @Value("${ftp.ip}")
    public String ip;
    @Value("${ftp.port}")
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
