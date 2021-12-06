package by.putseta.task01.service;

/**
 * Class for solving arithmetic tasks
 */
public class ArithmeticService {

    /**
     * Method for calculate the arithmetic mean of two numbers
     *
     * @param x first entered value
     * @param y second entered value
     * @return returns the average value of 2 entered values
     */
    public double countAverageValue(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Method for finds the value of an expression a*x*x + b*x + c
     *
     * @param a first entered value
     * @param b second entered value
     * @param c third entered value
     * @param x fourth entered value
     * @return the result of expression
     */
    public double countExpressionModule(double a, double b, double c, double x) {
        return a * x * x + b * x + c;
    }

}
