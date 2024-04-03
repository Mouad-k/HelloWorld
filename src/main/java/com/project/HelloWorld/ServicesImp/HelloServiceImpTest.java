package com.project.HelloWorld.ServicesImp;
import com.project.HelloWorld.Services.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class HelloServiceImpTest {
    @Autowired
   private HelloServiceImp HelloService ;

    @Test
    public void GetHelloMessageTest(){
        String message = HelloService.getHelloMessage();
        assertNotNull(message);
        assertEquals("Hello world" , message);



    }



}
