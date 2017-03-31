package com.kxlist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxd
 * @create 2017-03-29 11:02
 **/
@RestController
public class Hello {

    @GetMapping("/")
    public String sayHello(){
        return "hello spring boot";
    }
}
