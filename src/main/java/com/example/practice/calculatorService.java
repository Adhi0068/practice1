package com.example.practice;

import org.springframework.stereotype.Service;

@Service
public class calculatorService {

    public double add(double input1, double input2) throws IllegalArgumentException{
        return  input1 + input2;
    }

    public double subtract(double input1, double input2) throws IllegalArgumentException{
        return input1 - input2;
    }

    public double multiply(double input1, double input2) throws IllegalArgumentException{
        return  input1 * input2;
    }

    public double divide(double input1, double input2) throws IllegalArgumentException{
        if (input2 == 0) throw new IllegalArgumentException("Can't be divided by 0");
        return input1 / input2;

    }
}
