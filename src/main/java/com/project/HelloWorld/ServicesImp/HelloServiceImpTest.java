package com.project.HelloWorld.ServicesImp;

import com.project.HelloWorld.Entities.HelloEntity;
import com.project.HelloWorld.Repositories.HelloRepository;
import com.project.HelloWorld.Services.HelloService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class HelloServiceImpTest {

    @Mock
    private HelloRepository helloRepository;

    private HelloService helloService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        helloService = new HelloServiceImp(helloRepository);
    }

    @Test
    public void testGetHelloMessage() {

        HelloEntity mockHelloEntity = new HelloEntity();
        mockHelloEntity.setMessage("Hello world");
        when(helloRepository.findById(1L)).thenReturn(Optional.of(mockHelloEntity));

        String helloMessage = helloService.getHelloMessage();

        assertEquals("Hello world", helloMessage);
    }

    @Test
    public void testGetHelloMessageWhenNotFound() {

        when(helloRepository.findById(1L)).thenReturn(Optional.empty());

        String helloMessage = helloService.getHelloMessage();

        assertEquals("error", helloMessage);
    }
}
