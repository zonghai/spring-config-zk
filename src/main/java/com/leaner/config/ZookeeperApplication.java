package com.leaner.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @desc
 * @auth 十三先生
 * @date 2020-03-10
 */
@EnableConfigurationProperties
@SpringBootApplication
public class ZookeeperApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperApplication.class);
    }
}
