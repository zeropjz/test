package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGItController {

    @RequestMapping("/test/git")
    public void gitTest1() {
        System.out.println("git1111");
    }

}