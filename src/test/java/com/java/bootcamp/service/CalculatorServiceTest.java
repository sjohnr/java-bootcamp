package com.java.bootcamp.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class CalculatorServiceTest {
    @InjectMocks
    private CalculatorService calculatorService;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testAdd() {
        assertEquals(2, calculatorService.add(1, 1));
    }
}
