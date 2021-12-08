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
     * @param scanner input value
     * @return entered value or -1
     * @see IoData#inPutInt()
     */
    public int validateInputInt(Scanner scanner) {
        IoData ioData = new IoData();
        if (scanner.hasNextInt()) {
            return scanner.nextInt();

        } else {
            ioData.outPutInfoForUser(INCORRECT_DATA);
            scanner.next();
            return -1;
        }
    }

    /**
     * Method validating input integers and fractions
     *
     * @param scanner input value
     * @return true or false
     * @see IoData#inPutDouble()
     */
    public boolean validateInputDouble(Scanner scanner) {
        IoData ioData = new IoData();
        if (scanner.hasNextDouble()) {
            return true;
        } else {
            ioData.outPutInfoForUser(INCORRECT_DATA);
            scanner.next();
            return false;
        }

    }

    /**
     * Method validating input positive integers and fractions
     *
     * @param scanner input value
     * @return entered number or -1
     * @see IoData#inPutDoublePositive()
     */
    public double validateInputPositiveDouble(Scanner scanner) {
        IoData ioData = new IoData();
        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            if (number > 0) {
                return number;
            } else {
                ioData.outPutInfoForUser(INCORRECT_DATA);
                return -1;
            }
        } else {
            ioData.outPutInfoForUser(INCORRECT_DATA);
            scanner.next();
            return -1;
        }
    }
}

