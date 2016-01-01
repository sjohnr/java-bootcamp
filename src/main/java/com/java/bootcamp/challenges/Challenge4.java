package com.java.bootcamp.challenges;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class Challenge4 implements Runnable {
    private AtomicBoolean running = new AtomicBoolean(true);

    @PreDestroy
    public void destroy() {
        running.set(false);
        sleep(2);
    }

    @Override
    public void run() {
        while (running.get()) {
            System.out.println("Hello, world!");
            sleep(1);
        }
        System.out.println("Shutting down");
    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ignored) {}
    }
}
