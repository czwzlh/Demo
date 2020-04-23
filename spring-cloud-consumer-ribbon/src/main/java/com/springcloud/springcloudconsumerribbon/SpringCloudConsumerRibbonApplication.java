package com.springcloud.springcloudconsumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix //开启熔断
@EnableHystrixDashboard //熔断器仪表盘监控
public class SpringCloudConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerRibbonApplication.class, args);
    }

}
