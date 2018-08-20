package com.bigdata.learnsb.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloProperties {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Value("${com.bigdata.learnsb.name}")
    private String name;

    @Value("${com.bigdata.learnsb.title}")
    private String title;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Value("${com.bigdata.learnsb.environment}")
    private String environment;
}
