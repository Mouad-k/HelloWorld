package com.project.HelloWorld.ServicesImp;

import com.project.HelloWorld.Entities.HelloEntity;
import com.project.HelloWorld.Repositories.HelloRepository;
import com.project.HelloWorld.Services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements HelloService {

    private final HelloRepository helloRepository;


    public HelloServiceImp(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @Override
    public String getHelloMessage() {
        HelloEntity helloEntity = helloRepository.findById(1L).orElse(null);
        if (helloEntity != null) {
            return helloEntity.getMessage();
        } else {
            return "error";
        }
    }
}
