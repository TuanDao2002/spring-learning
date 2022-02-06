package com.khatun.roomwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {
    @GetMapping("/login.html")
    public String getLogin() {
        return "login.html"; //return the page login.html after receiving "/login.html" request from SecurityConfig.java
    }
}
