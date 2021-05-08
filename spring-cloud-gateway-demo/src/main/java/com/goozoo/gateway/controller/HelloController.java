package com.goozoo.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
       // return "Hello, I am a Service.";
        return "Hello，我是Spring Cloud Gateway。已经由9000端口跳转到新的端口。";
    }
}
