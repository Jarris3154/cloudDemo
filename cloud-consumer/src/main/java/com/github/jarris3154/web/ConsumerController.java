package com.github.jarris3154.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @GetMapping("/")
    public String getReply() {
        return "I'm the Consumer";
    }
}