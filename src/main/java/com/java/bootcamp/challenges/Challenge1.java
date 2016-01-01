package com.java.bootcamp.challenges;

import org.springframework.stereotype.Component;

@Component
public class Challenge1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, world!");
    }
}
