package com.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickStart {

    @RequestMapping("/quick")
    public String quick(){
        return "ok,你已经打开springboot的大门";
    }
}
