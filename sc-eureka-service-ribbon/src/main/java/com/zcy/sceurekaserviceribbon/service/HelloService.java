package com.zcy.sceurekaserviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    //断路qi
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiservice(String name){
        return restTemplate.getForObject("http://SC-EUREKA-CLIENT/hello?name="+name,String.class);
    }

    public String hiError(String name){
        return "hello, "+name +",sorry,error!";
    }

}
