package com.springcloud.springcloudservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: CaoZhiWei
 * @Date: 2020 - 04 - 15  9:56
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String sayHello(@RequestParam("msg") String msg){
        String format = String.format("Hello! Your message is : %s . I am from %s!", msg, port);
        return format;
    }
}
