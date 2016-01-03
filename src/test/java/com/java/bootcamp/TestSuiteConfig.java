package com.java.bootcamp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@Configuration
@ComponentScan("com.java.bootcamp")
@ContextConfiguration(classes = {ApplicationConfig.class})
public class TestSuiteConfig {
}
