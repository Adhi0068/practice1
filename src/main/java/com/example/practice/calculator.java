package com.example.practice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class calculator {

    //http://localhost:8080/index.html

    private calculatorService calculatorService;

    public calculator(calculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/letsCalculate")
    public double letsCalculate(
            @RequestParam double input1,
            @RequestParam double input2,
            @RequestParam String operation
    ){
        try {
            if (operation.equals("add")){
                double result = calculatorService.add(input1, input2);
                return result;
            } else if (operation.equals("subtract")) {
                double result = calculatorService.subtract(input1, input2);
                return result;
            } else if (operation.equals("multiply")) {
                double result = calculatorService.multiply(input1, input2);
                return result;
            }else {
                double result = calculatorService.divide(input1, input2);
                return result;
            }
        } catch (IllegalArgumentException e) {
            return Integer.parseInt(e.getMessage());
        }

    }


}
