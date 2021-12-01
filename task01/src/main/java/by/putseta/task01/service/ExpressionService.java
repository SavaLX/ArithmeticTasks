package by.putseta.task01.service;

import by.putseta.task01.entity.Data;

public class ExpressionService {
    private final Data data = new Data();

    public double swapFractionalAndIntegerParts(double x) {
        return (x * 1000) % 1000 + (int) x / 1000.0;
    }

    public int findOrdinalNumberOfSymbol(String x) { // Determines the ordinary number of character in the table Unicode
        data.add(x.charAt(0));
        return (x.charAt(0));
    }

    public char displayPreviousCharacter() {   // Determines the previous character in the table Unicode
        return (char) (data.get(0) - 1);
    }

    public char displayNextCharacter() {      // Determines the next character in the table Unicode
        return (char) (data.get(0) + 1);
    }

    public double findSmallerNumber(double x, double y) {   // finds the smallest number of two
        return x > y ? y : x;
    }

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

    public String determineGender(String x) {  // determines the gender of the user
        if (x.equals("B")) {
            return "I like boys";
        } else {
            return "I like girls";
        }
    }

    public String definitionOfAccessLevel(double x) {  // defines access to the database by password
        return switch ((int) x) {
            case 9583, 1747 -> "A,B,C";
            case 3331, 7922 -> "B,C";
            case 9455, 8997 -> "C";
            default -> "No any access";
        };
    }

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
}

