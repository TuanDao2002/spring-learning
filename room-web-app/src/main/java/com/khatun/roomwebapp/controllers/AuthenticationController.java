package com.khatun.roomwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {
    @GetMapping("/login")
    //return the page login.html after receiving "/login" request
    public String getLogin() {
        //return "login.html" (both ways are the same)
        return "login";
    }
}
