package com.springcloud.springcloudconsumerribbon.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.servlet.ServletRegistration;

/**
 * @Author: CaoZhiWei
 * @Date: 2020 - 04 - 21  13:47
 */
@Configuration //将该类作为spring容器
public class SpringConfiguration {

    @Bean(name = "restTemplate") //将实例注册到spring容器中,name指定实例名称，initMethod指定初始化方法，destroyMethod指定销毁方法
    @LoadBalanced //开启负载均衡功能
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean(name = "registrationBean")
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
