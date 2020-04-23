package com.springcloud.springcloudconsumerfeign.controller;

import com.springcloud.springcloudconsumerfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: CaoZhiWei
 * @Date: 2020 - 04 - 22  9:11
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("msg") String msg){
        return feignService.sayHello(msg);
    }
}
