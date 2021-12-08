package by.putseta.task01.view;

import by.putseta.task01.validation.Validation;

import java.util.Scanner;

/**
 * Class for input and output values
 */
public class IoData {

    private static final String INCORRECT_DATA = "Incorrect data please, try again: ";
    private final Validation validation = new Validation();
    private final Scanner scanner = new Scanner(System.in);


    public int inPutInt() {  // method for entering only integers
        int res = validation.validateInputInt(scanner);
        while (res == -1) {
            res = validation.validateInputInt(scanner);
        }
        return res;
    }

    public double inPutDouble() { // method for entering fractions and integers
        do {
            validation.validateInputDouble(scanner);
        } while (!validation.validateInputDouble(scanner));
        return scanner.nextDouble();
    }


    public double inPutDoublePositive() { // method for entering positive fractions and integers
        double res = validation.validateInputPositiveDouble(scanner);
        while (res == -1) {
            res = validation.validateInputPositiveDouble(scanner);
        }
        return res;
    }

    public String inPutOneSymbol() {  // method for entering only one symbol
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (str.length() != 1) {
            outPutInfoForUser(INCORRECT_DATA);
            str = sc.nextLine();
        }
        return str;
    }

    public void outPutInfoForUser(String str) {
        System.out.print(str);
    }

    public void outPutInfoForUserNextLine(String str) {
        System.out.println(str);
    }
}
