package com.project.HelloWorld.ServicesImp;

import com.project.HelloWorld.Entities.HelloEntity;
import com.project.HelloWorld.Repositories.HelloRepository;
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

    @InjectMocks
    private HelloServiceImp helloService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetHelloMessage() {
        // Arrange
        HelloEntity mockHelloEntity = new HelloEntity();
        mockHelloEntity.setMessage("Hello world");
        when(helloRepository.findById(1L)).thenReturn(Optional.of(mockHelloEntity));

        // Act
        String helloMessage = helloService.getHelloMessage();

        // Assert
        assertEquals("Hello world", helloMessage);
    }

    @Test
    public void testGetHelloMessageWhenNotFound() {
        // Arrange
        when(helloRepository.findById(1L)).thenReturn(Optional.empty());

        // Act
        String helloMessage = helloService.getHelloMessage();

        // Assert
        assertEquals("error", helloMessage);
    }
}
