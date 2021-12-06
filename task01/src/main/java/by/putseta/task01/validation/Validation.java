package by.putseta.task01.validation;

import java.util.Scanner;

public class Validation {

    private static final String INCORRECT_DATA = "Incorrect data please, try again: ";


    public int validateInputInt(Scanner scanner) {  // validating input integers
        if (scanner.hasNextInt()) {
//            int number = scanner.nextInt();
            return scanner.nextInt();

        } else {
            System.out.println(INCORRECT_DATA);
            scanner.next();
            return -1;
        }
    }

    public boolean validateInputDouble(Scanner scanner) {  // validating input integers and fractions
        if (scanner.hasNextDouble()) {
            return true;
        } else {
            System.out.println(INCORRECT_DATA);
            scanner.next();
            return false;
        }

    }

    public double validateInputPositiveDouble(Scanner scanner) {  // // validating input positive integers and fractions
        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            if (number > 0) {
                return number;
            } else {
                System.out.println(INCORRECT_DATA);
                return -1;
            }
        } else {
            System.out.println(INCORRECT_DATA);
            scanner.next();
            return -1;
        }
    }
}

