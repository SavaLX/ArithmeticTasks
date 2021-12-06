package by.putseta.task01.validation;

import by.putseta.task01.view.IoData;

import java.util.Scanner;

/**
 * Class for validate entered data
 */
public class Validation {

    private static final String INCORRECT_DATA = "Incorrect data please, try again: ";

    /**
     * Method for validating input integers
     *
     * @param scanner
     * @return entered value or -1
     * @see IoData#inPutInt()
     */
    public int validateInputInt(Scanner scanner) {
        if (scanner.hasNextInt()) {
//            int number = scanner.nextInt();
            return scanner.nextInt();

        } else {
            System.out.println(INCORRECT_DATA);
            scanner.next();
            return -1;
        }
    }

    /**
     * Method validating input integers and fractions
     *
     * @param scanner
     * @return true or false
     * @see IoData#inPutDouble()
     */
    public boolean validateInputDouble(Scanner scanner) {
        if (scanner.hasNextDouble()) {
            return true;
        } else {
            System.out.println(INCORRECT_DATA);
            scanner.next();
            return false;
        }

    }

    /**
     * Method validating input positive integers and fractions
     *
     * @param scanner
     * @return entered number or -1
     * @see IoData#inPutDoublePositive()
     */
    public double validateInputPositiveDouble(Scanner scanner) {
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

