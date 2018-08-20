package com.bigdata.learnsb.controller;

import com.bigdata.learnsb.property.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloProperties helloProperties;

    @RequestMapping("/hello")
    public String index(){
        return "Hello CWX" + " in " + helloProperties.getEnvironment().toString();
    }
}
