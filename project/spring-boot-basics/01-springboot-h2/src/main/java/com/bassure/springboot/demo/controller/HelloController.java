package com.bassure.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String helloController() {

        return "Hello controller, Welcome to Spring - Boot Application";
    }

}
