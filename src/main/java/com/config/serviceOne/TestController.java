package com.config.serviceOne;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${greet.message}")
    String message;

    @GetMapping("/")
    public String greet(){
        return message;
    }
}
