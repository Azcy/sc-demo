package com.zcy.sceurekaclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ScEurekaClient2Application {

    public static void main(String[] args) {

        SpringApplication.run(ScEurekaClient2Application.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "zcy")String name) {
        return "hello "+name+" ,i am sc-eureka-client-2 from :"+port;
    }

}
