package com.springcloud.springcloudconsumerribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.springcloud.springcloudconsumerribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: CaoZhiWei
 * @Date: 2020 - 04 - 21  14:47
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorManage")
    public String sayHello(String msg) {
        return restTemplate.getForObject("http://spring-cloud-service/sayHello?msg="+msg,String.class);
    }

    //熔断方法，服务崩溃时调用
    public String errorManage(String msg){
        return "your message is " + msg + ". ps:service error!";
    }
}
