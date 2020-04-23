package com.springcloud.springcloudconsumerfeign.service.impl;

import com.springcloud.springcloudconsumerfeign.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: CaoZhiWei
 * @Date: 2020 - 04 - 22  9:50
 */
@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String sayHello(String msg) {
        return "your message is " + msg + ". ps:service error!";
    }
}
