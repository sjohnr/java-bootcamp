package com.java.bootcamp.challenges;

import com.java.bootcamp.service.CalculatorService;
import org.springframework.stereotype.Component;

@Component
public class Challenge3 implements Runnable {
    @Override
    public void run() {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.add(1, 1);
        if (result == 2) {
            System.out.println("[Pass] : 1 + 1 = 2");
        } else {
            System.out.println("[Fail] : 1 + 1 = " + result);
        }
    }
}
