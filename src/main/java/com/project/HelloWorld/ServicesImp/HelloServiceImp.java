package com.project.HelloWorld.ServicesImp;

import com.project.HelloWorld.Services.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements HelloService {
    @Override
    public String getHelloMessage() {
        return "Hello world";
    }



}
