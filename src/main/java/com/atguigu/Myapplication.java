package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atguigu.dao")
@SpringBootApplication //声明这是一个springboot类
public class Myapplication {
    public static void main(String[] args) {
        SpringApplication.run(Myapplication.class,args);
    }
}
