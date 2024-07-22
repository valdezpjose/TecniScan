package com.example.arithmeticapiapplication.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperationResult {
    private double operand1;
    private double operand2;
    private double result;
    private String operation;
}