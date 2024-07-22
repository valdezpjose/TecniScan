package com.example.arithmeticapiapplication.service;

import com.example.arithmeticapiapplication.model.OperationResult;

public interface ArithmeticService {
    OperationResult sum(double a, double b);
    OperationResult subtract(double a, double b);
    OperationResult multiply(double a, double b);
    OperationResult divide(double a, double b);
}