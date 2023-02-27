package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGItController {

    @RequestMapping("/test/git")
    public void gitTest() {
        System.out.println("git测试!");
        System.out.println("git分支测试!");
          System.out.println("git分支测试2!");
         System.out.println("git分支测试3!");
        System.out.println("git分支测试4!");


        System.out.println("git分支测试5 --分支合并!");
    }


}
