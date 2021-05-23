package com.example.homework4;

public class Calculator {
    public  String  number1 = "" ;
    public  String  number2 = "";
    public double result = 0;

    public double Sum() {
        result = Double.parseDouble(number1) + Double.parseDouble(number2);
        return result;
    }

    public double Min() {
        result = Double.parseDouble(number1) - Double.parseDouble(number2);
        return result;
    }

    public double Mult() {
        result = Double.parseDouble(number1) * Double.parseDouble(number2);
        return result;
    }

    public double Div() {
        result = Double.parseDouble(number1) / Double.parseDouble(number2);
        return result;
    }

    public double Proc() {
        result = Double.parseDouble(number1) % Double.parseDouble(number2);
        return result;
    }
}


