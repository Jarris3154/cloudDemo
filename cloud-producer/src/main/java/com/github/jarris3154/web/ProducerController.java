package com.github.jarris3154.web;

import com.github.jarris3154.Configuration;
import com.github.jarris3154.bean.ConsumerConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public ConsumerConfiguration retriveLimitsFromConfigurations() {
        return new ConsumerConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}