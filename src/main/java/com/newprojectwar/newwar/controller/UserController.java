package com.newprojectwar.newwar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiwar")
public class UserController {

    @RequestMapping("/user")
    public String getUser() {
        return "this is war project";
    }

}
