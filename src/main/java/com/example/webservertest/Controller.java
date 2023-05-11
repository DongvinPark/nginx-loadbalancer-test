package com.example.webservertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/health/check")
    public String healthCheck(){
        return "Health Check Success!";
    }

}
