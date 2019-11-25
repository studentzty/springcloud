package com.zty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :
 * @version :
 * @date : 2019-11-22 16:50
 */
@RestController
@RequestMapping("/main")
public class HelloController {
    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/welcome")
    public String welcome(){
        String result = "server:"+discoveryClient.getServices();
        return result;
    }
}
