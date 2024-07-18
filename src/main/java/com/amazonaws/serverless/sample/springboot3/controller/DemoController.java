package com.amazonaws.serverless.sample.springboot3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@RestController
public class DemoController {
    @GetMapping("/demo")
    public String something() {
        return "Hello World";
    }
}
