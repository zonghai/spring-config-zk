package com.leaner.config.web;

import com.leaner.config.zookeeper.DynamicProperty;
import com.leaner.config.zookeeper.StaticProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc
 * @auth 十三先生
 * @date 2020-03-10
 */
@RestController
public class TestController {
    @Autowired
    private DynamicProperty dynamicProperty;
    @Autowired
    private StaticProperty staticProperty;

    @GetMapping("/dynamic")
    public String dynamic() {
        return dynamicProperty.ip + dynamicProperty.port;
    }

    @GetMapping("/statics")
    public String statics() {
        return staticProperty.ip + staticProperty.port;
    }
}
