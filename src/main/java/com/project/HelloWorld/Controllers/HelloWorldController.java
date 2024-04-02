
package com.project.HelloWorld.Controllers;



import com.project.HelloWorld.Services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private final HelloService helloService ;
    @Autowired
    public HelloWorldController(HelloService helloService){
        this.helloService = helloService;
    }
    @GetMapping("/hello")
    public String hello () {
        return helloService.getHelloMessage();


    }
}
