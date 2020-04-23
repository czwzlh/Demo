package com.springcloud.springcloudconsumerribbon.controller;

import com.springcloud.springcloudconsumerribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: CaoZhiWei
 * @Date: 2020 - 04 - 21  14:50
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String sayHello(@RequestParam String msg){
        return helloService.sayHello(msg);
    }
}
