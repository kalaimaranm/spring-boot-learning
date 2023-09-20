package com.kalai.authentiationbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

    @GetMapping("/hello")
    public String helloUserController() {

        return "user access level";
    }

}
