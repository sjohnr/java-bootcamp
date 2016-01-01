package com.java.bootcamp.challenges;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Component
public class Challenges implements Runnable {
    @Inject
    private Challenge1 challenge1;

    @Inject
    private Challenge2 challenge2;

    @PostConstruct
    public void runChallenges() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}

        challenge1.run();
    }
}
