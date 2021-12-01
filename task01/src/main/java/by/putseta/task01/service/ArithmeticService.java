package by.putseta.task01.service;

public class ArithmeticService {


    public double countAverageValue(double x, double y) {  // calculates the arithmetic mean of two numbers
        return (x + y) / 2.0;
    }

    public double countExpressionModule(double a, double b, double c, double x) { // finds the value of an expression
        return a * x * x + b * x + c;
    }

}
