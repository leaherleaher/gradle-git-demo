package com.own.service.two.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @Author yangtao
 * @Date 2018/10/11 13:52
 */
@RestController
@RequestMapping(value="/demo")
public class Test {

    @GetMapping(value="/one")
    public String one(){
        return "one";
    }
}
