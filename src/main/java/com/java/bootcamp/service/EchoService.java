package com.java.bootcamp.service;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class EchoService {
    public String echo(@NotNull String request) {
        return request;
    }
}
