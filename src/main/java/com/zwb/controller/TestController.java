package com.zwb.controller;

import com.zwb.service.Test01Service;
import com.zwb.service.Test02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Test01Service test01Service;
    @Autowired
    private Test02Service test02Service;

    @GetMapping("/test01")
    public String test1() {

        for (int i = 0; i < 20; i++) {
            test01Service.m1();
        }

        return "ok";

    }

    @GetMapping("/test02")
    public String test2() {
        return test02Service.m1();

    }
}
