package by.putseta.task01.controller;

import by.putseta.task01.entity.Data;
import by.putseta.task01.service.ExpressionService;
import by.putseta.task01.view.IoData;

public class RunnerCyclesTasks {
    private final IoData ioData = new IoData();

    public void runCyclesTask() {

        Data data;
        int taskNumber;

        System.out.println("And finally you can choose which of 5 cycles tasks ( Available tasks : № 5 , 7, 19, 21, 33) " +
                "you want to solve");

        do {
            System.out.print("Enter number of task or enter the 0 to exit from program: ");
            taskNumber = ioData.inPutInt();
            switch (taskNumber) {
                case (5):   /* Use the while statement to write a program for determining the sum of all odd numbers in
                range from 1 to 99 inclusive. */

                    ExpressionService oddNumber = new ExpressionService();

                    System.out.println("Sum of odd numbers from 1 to 99 =" + oddNumber.findSumOfOddNumbers());

                    break;
                case (7):   /* Calculate the values of the function on the segment [a, b] with step h:  */

                    data = new Data();

                    System.out.print("Enter the value of 'a': ");
                    data.add(ioData.inPutDouble());  // put value 'a' in collection
                    System.out.print("Enter the value of 'b': ");
                    data.add(ioData.inPutDouble());  // put value 'b' in collection
                    System.out.print("Enter the value of 'h': ");
                    data.add(ioData.inPutDouble());  // put value 'h' in collection

                    ExpressionService function = new ExpressionService();
                    function.calculateFunctionValues(data.get(0), data.get(1), data.get(2));

                    break;
                case (19):  /* Given a number of series and some number e. Find the sum of those terms of the series whose
                 modulus is greater than or is equal to a given e. */

                    data = new Data();

                    System.out.print("Enter the value of 'e': ");
                    data.add(ioData.inPutDouble());  // put value 'e' in collection
                    System.out.print("Enter the value of 'n': ");
                    data.add(ioData.inPutDouble());  // put value 'n' in collection

                    ExpressionService member = new ExpressionService();
                    System.out.println("The sum = " + member.findSumOfMembersOfSeries(data.get(0),
                            data.get(1)));

                    break;
                case (21):   /* Write a program for calculating the values of the function F (x) on the segment [a, b]
                with step h. Result represent in the form of a table, the first column of which is the values of the
                argument, the second is the corresponding function values: F (x) = x - sin (x)   */

                    ExpressionService functionValues = new ExpressionService();
                    functionValues.calculateFunctionValues();

                    break;
                case (33):   /* Find the largest digit of a given natural number.  */

                    data = new Data();

                    System.out.println("Enter the number: ");
                    data.add(ioData.inPutDoublePositive());  // put entered number in collection

                    ExpressionService largestDigit = new ExpressionService();
                    System.out.println("The largest digit in number = " + largestDigit.findLargestDigitInNumber((int) data.get(0)));

                    break;
                case (0):
                    break;
                default:
                    System.out.println("This task doesn't exist");
                    break;
            }
        } while (taskNumber != 0);
        System.out.println("You had left from program");
    }


}
