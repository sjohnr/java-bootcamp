package com.java.bootcamp.service;

import static org.junit.Assert.assertEquals;

import com.java.bootcamp.service.EchoService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class EchoServiceTest {
    @InjectMocks
    private EchoService echoService;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testEcho() {
        String request = "test";
        String response = echoService.echo(request);
        
        assertEquals(request, response);
    }
}
