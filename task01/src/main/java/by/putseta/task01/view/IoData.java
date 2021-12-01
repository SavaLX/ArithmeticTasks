package by.putseta.task01.view;

import java.util.Scanner;

public class IoData {

    private static final String ONE_MORE_TIME = "Please, try again: ";
    private static final String INCORRECT_DATA = "Incorrect data";

    public int inPutInt() {  // method for entering only integers
        Scanner sc = new Scanner(System.in);
        int input;
        while (!sc.hasNextInt()) {
            System.out.println(INCORRECT_DATA);
            sc.next();
            System.out.print(ONE_MORE_TIME);
        }
        input = sc.nextInt();
        return input;
    }

    public double inPutDouble() { // method for entering fractions and integers
        Scanner sc = new Scanner(System.in);
        double input;
        while (!sc.hasNextDouble()) {
            System.out.println(INCORRECT_DATA);
            sc.next();
            System.out.print(ONE_MORE_TIME);
        }
        input = sc.nextDouble();
        return input;
    }

    public double inPutDoublePositive() { // method for entering positive fractions and integers
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        while (a < 0) {
            System.out.print("Enter A Positive Number: ");
            a = sc.nextDouble();
        }
        return a;
    }

    public String inPutSymbol() {  // method for entering characters 'B' or 'G'
        Scanner sc = new Scanner(System.in);
        String input;
        while (!sc.hasNextLine()) {
            System.out.println(INCORRECT_DATA);
            sc.next();
            System.out.print(ONE_MORE_TIME);
        }
        input = sc.nextLine();
        return input;
    }
}
