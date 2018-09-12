package com.zcy.sceurekaservicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients //开启Feign的功能
public class ScEurekaServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaServiceFeignApplication.class, args);
    }
}
