package com.springcloud.springcloudconsumerfeign.service;

import com.springcloud.springcloudconsumerfeign.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-service",fallback = FeignServiceImpl.class)
public interface FeignService {

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String sayHello(@RequestParam("msg") String msg);
}
