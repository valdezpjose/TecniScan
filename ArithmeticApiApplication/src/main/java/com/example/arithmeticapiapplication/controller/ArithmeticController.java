package com.example.arithmeticapiapplication.controller;


import com.example.arithmeticapiapplication.model.OperationResult;
import com.example.arithmeticapiapplication.service.ArithmeticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class ArithmeticController {

    private final ArithmeticService arithmeticService;

    @Autowired
    public ArithmeticController(ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    @GetMapping("/sum")
    public OperationResult sum(@RequestParam double a, @RequestParam double b) {
        return arithmeticService.sum(a, b);
    }

    @GetMapping("/subtract")
    public OperationResult subtract(@RequestParam double a, @RequestParam double b) {
        return arithmeticService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public OperationResult multiply(@RequestParam double a, @RequestParam double b) {
        return arithmeticService.multiply(a, b);
    }

    @GetMapping("/divide")
    public OperationResult divide(@RequestParam double a, @RequestParam double b) {
        return arithmeticService.divide(a, b);
    }
}
