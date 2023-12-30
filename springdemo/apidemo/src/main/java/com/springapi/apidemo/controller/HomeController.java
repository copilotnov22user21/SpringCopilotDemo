package com.springapi.apidemo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getHome() {
        return "Welcome to Spring API Demo..... Git hub checking";
    }
}
