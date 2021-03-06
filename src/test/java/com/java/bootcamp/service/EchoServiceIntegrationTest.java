package com.java.bootcamp.service;

import static org.junit.Assert.assertEquals;

import com.java.bootcamp.TestSuiteConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.validation.ConstraintViolationException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestSuiteConfig.class})
public class EchoServiceIntegrationTest {
    @Inject
    private EchoService echoService;
    
    @Before
    public void setUp() {
        
    }
    
    @Test
    public void testEcho() {
        String request = "test";
        String response = echoService.echo(request);
        
        assertEquals(request, response);
    }
    
    @Test(expected = ConstraintViolationException.class)
    public void testEcho_NotNull() {
        echoService.echo(null);
    }
}
