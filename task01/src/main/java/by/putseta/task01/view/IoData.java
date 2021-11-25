package by.putseta.task01.view;

import java.util.Scanner;

public class IoData {

    public int inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int i;
        return i = sc.nextInt();
    }

    public static void doGreeting() {
        System.out.println("Hello! You can choose which of 5 linear tasks you want to solve, please enter the task " +
                "number:");
    }
}
