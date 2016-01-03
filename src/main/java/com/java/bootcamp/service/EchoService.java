package com.java.bootcamp.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Service
@Validated
public class EchoService {
    public String echo(@NotNull String request) {
        return request;
    }
}
