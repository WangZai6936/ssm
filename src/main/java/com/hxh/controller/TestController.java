package com.hxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestController
 * @Description
 * @Author huxuanhao
 * @Date 2023/11/30 14:27
 */
@Controller
public class TestController {
    @RequestMapping("/hi")
    public String hi(){
        System.out.println("21");
        return "hi";
    }
}