package by.putseta.task01.service;

import by.putseta.task01.entity.Data;

/**
 * Class for solving different expression tasks
 */
public class ExpressionService {

    private final Data data = new Data();

    /**
     * Method for swap fractional and integer parts of number
     *
     * @param x some entered number
     * @return entered number with swapped fractional and integer parts
     */
    public double swapFractionalAndIntegerParts(double x) {
        return (x * 1000) % 1000 + (int) x / 1000.0;
    }

    /**
     * Method for determining the ordinary number of character in the table Unicode
     *
     * @param x same entered number
     * @return the ordinary number of character based on table Unicode
     */
    public double findOrdinalNumberOfSymbol(String x) {
        data.add(x.charAt(0));
        return (data.get(0));
    }

    /**
     * Method for determining the previous character
     *
     * @return the previous character
     * @see #findOrdinalNumberOfSymbol(String)
     */
    public char displayPreviousCharacter() {   // Determines the previous character in the table Unicode
        return (char) (data.get(0) - 1);
    }

    /**
     * Method for determining the next character
     *
     * @return the next character
     * @see #findOrdinalNumberOfSymbol(String)
     */
    public char displayNextCharacter() {      // Determines the next character in the table Unicode
        return (char) (data.get(0) + 1);
    }

    /**
     * Method for finding the smallest number of two
     *
     * @param x first entered number
     * @param y second entered number
     * @return smallest number
     */
    public double findSmallerNumber(double x, double y) {
        return x > y ? y : x;
    }

    /**
     * Method for counting the number of positive numbers
     *
     * @param a first entered number
     * @param b second entered number
     * @param c third entered number
     * @return number of positive numbers
     */
    public int countPositiveNumbers(double a, double b, double c) {  // counts the number of positive numbers
        int count = 0;
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        return count;
    }

    /**
     * Method for determining users gender
     *
     * @param x entered 'B' or 'G'
     * @return returns a response based on gender of user
     */
    public String determineGender(String x) {
        if (x.equalsIgnoreCase("B")) {
            return "I like boys";
        } else if (x.equalsIgnoreCase("G")) {
            return "I like girls";
        } else {
            return "Incorrect data";
        }
    }

    /**
     * Method for defining access to the database by password
     *
     * @param x entered password
     * @return access to the database
     */
    public String definitionOfAccessLevel(double x) {
        return switch ((int) x) {
            case 9583, 1747 -> "A,B,C";
            case 3331, 7922 -> "B,C";
            case 9455, 8997 -> "C";
            default -> "No any access";
        };
    }

    /**
     * Method for finding the sum of odd numbers from 1 to 99
     *
     * @return the sum of odd numbers from 1 to 99
     */
    public int findSumOfOddNumbers() {   // finds the sum of odd numbers from 1 to 99
        int i = 1;
        int sum = 0;
        while (i < 100) {
            sum = sum + i;
            i += 2;
        }
        return sum;
    }

    public void calculateFunctionValues(double a, double b, double h) {  // finds the value of a function
        double y;

        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
    }

    public double findSumOfMembersOfSeries(double e, double n) { // finds the value of a function
        double sum = 0.0;
        double an;

        for (int i = 0; i <= n; i++) {
            an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(an) >= e) {
                sum += an;
            }
        }
        return sum;
    }

    public void calculateFunctionValues() { // finds the value of a function
        double a = 0.1;
        double b = 8;
        double h = 0.1;
        double y;

        System.out.println(" -----------------------");
        System.out.println("|     x     |     y     |");

        for (double i = a; i <= b; i += h) {

            y = i - Math.sin(i);
            System.out.println(" -----------------------");
            System.out.printf("|%-11f|%-11f|\n", i, y);
        }
    }

    public int findLargestDigitInNumber(int n) { // finds the largest digit in the entered number
        int x;
        int m = 0;
        while (n > 0) {
            x = n % 10;
            if (x > m) m = x;
            n /= 10;
        }
        return m;
    }

    public void swapEnteredNumbersFirstWay(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);
    }

    public void swapEnteredNumbersSecondWay(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
        a = a + b - (b = a);
        System.out.println("a = " + a + " b = " + b);
    }

    public void swapEnteredNumbersThirdWay(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a = " + a + " b = " + b);
    }
}

