package com.crossminds.cucumberexample.service.calculator;

import org.springframework.stereotype.Service;

/**
 * The calculator service business component implementation.
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {

    public int sum(int a, int b) {
        return a + b;
    }

    public int crazyOperation(int a, int b, int c) {
        return a * b - c;
    }
}
