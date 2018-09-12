package com.zcy.sceurekaserviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //向服务中心注册
@EnableHystrix //开启hystrix 断路器
public class ScEurekaServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaServiceRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced//开启负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
