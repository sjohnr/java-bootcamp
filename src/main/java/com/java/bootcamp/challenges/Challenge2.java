package com.java.bootcamp.challenges;

import com.java.bootcamp.service.EchoService;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class Challenge2 implements Runnable {
    @Inject
    private EchoService echoService;

    @Override
    public void run() {
        String echo = echoService.echo("Hello, world!");
        System.out.println("EchoService responded with '" + echo + "'");
    }
}
