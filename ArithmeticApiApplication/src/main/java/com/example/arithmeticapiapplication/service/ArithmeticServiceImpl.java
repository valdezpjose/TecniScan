package com.example.arithmeticapiapplication.service;

import com.example.arithmeticapiapplication.model.OperationResult;
import org.springframework.stereotype.Service;


@Service
public class ArithmeticServiceImpl implements ArithmeticService {

    @Override
    public OperationResult sum(double a, double b) {
        return new OperationResult(a, b, a + b, "sum");
    }

    @Override
    public OperationResult subtract(double a, double b) {
        return new OperationResult(a, b, a - b, "subtract");
    }

    @Override
    public OperationResult multiply(double a, double b) {
        return new OperationResult(a, b, a * b, "multiply");
    }

    @Override
    public OperationResult divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return new OperationResult(a, b, a / b, "divide");
    }
}
