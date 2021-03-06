package by.putseta.task01.controller;

import by.putseta.task01.entity.Data;
import by.putseta.task01.service.ArithmeticService;
import by.putseta.task01.service.ExpressionService;
import by.putseta.task01.view.IoData;

/**
 * Class for run the branching tasks
 */

public class RunnerBranchingTasks {

    private final IoData ioData = new IoData();

    /**
     * Here start point of solving branching task
     */
    public void runBranchingTask() {

        Data data;
        int taskNumber;

        ioData.outPutInfoForUserNextLine("Now you can choose which of 5 branching tasks ( Available tasks : № 5 , 7, 19, 21, 33) " +
                "you want to solve");

        do {
            ioData.outPutInfoForUser("Enter number of task or enter the 0 to exit from branching task and go to cycles tasks: ");
            taskNumber = ioData.inPutInt();
            switch (taskNumber) {
                case (5):   /* Make a program: determining the smallest of two numbers a and b. */

                    data = new Data();

                    ioData.outPutInfoForUser("Enter the first number: ");
                    data.add(ioData.inPutDouble()); // put first number in collection
                    ioData.outPutInfoForUser("Enter the second number: ");
                    data.add(ioData.inPutDouble()); // put second number in collection

                    ExpressionService smallerNumber = new ExpressionService();
                    ioData.outPutInfoForUserNextLine("The smaller number = " + smallerNumber.findSmallerNumber(data.get(0), data.get(1)));

                    break;
                case (7):    /* Create a program for finding the modulus of expression a * x * x + b * x + c
                for given values of a, b, c and x */

                    data = new Data();

                    ioData.outPutInfoForUser("Enter the value of 'a': ");
                    data.add(ioData.inPutDouble());  // put value 'a' in collection
                    ioData.outPutInfoForUser("Enter the value of 'b': ");
                    data.add(ioData.inPutDouble());  // put value 'b' in collection
                    ioData.outPutInfoForUser("Enter the value of 'c': ");
                    data.add(ioData.inPutDouble());  // put value 'c' in collection
                    ioData.outPutInfoForUser("Enter the value of 'x': ");
                    data.add(ioData.inPutDouble());  // put value 'x' in collection

                    ArithmeticService module = new ArithmeticService();
                    ioData.outPutInfoForUserNextLine("The result of expression module = " + module.countExpressionModule(data.get(0),
                            data.get(1), data.get(2), data.get(3)));

                    break;
                case (19):   /* Count the number of positives among the numbers a, b, c.  */

                    data = new Data();

                    ioData.outPutInfoForUser("Enter the value of 'a': ");
                    data.add(ioData.inPutDouble());  // put value 'a' in collection
                    ioData.outPutInfoForUser("Enter the value of 'b': ");
                    data.add(ioData.inPutDouble());  // put value 'b' in collection
                    ioData.outPutInfoForUser("Enter the value of 'c': ");
                    data.add(ioData.inPutDouble());  // put value 'c' in collection

                    ExpressionService positiveCount = new ExpressionService();
                    ioData.outPutInfoForUserNextLine("The number of positive numbers = " + positiveCount.countPositiveNumbers(data.get(0),
                            data.get(1), data.get(2)));

                    break;
                case (21):   /* The program is a flatterer. The screen displays the question “Who are you: a boy or
                 a girl? Enter B or G ". V Depending on the answer, the text "I like girls! should appear on the screen
                  or "I like boys!"  */

                    data = new Data();

                    ioData.outPutInfoForUserNextLine("Who are you: boy or girl? Enter B or G");
                    data.addString(ioData.inPutOneSymbol());  // put entered letter in collection

                    ExpressionService flatterer = new ExpressionService();
                    ioData.outPutInfoForUserNextLine(flatterer.determineGender(data.getString(0)));

                    break;
                case (33):    /*  Write a program that, using a password, will determine the employee's level of access
                 to classified information in database. Only six people have access to the base, divided into three
                  groups according to the degree of access. They have the following passwords: 9583, 1747 - modules
                   of bases A, B, C are available; 3331, 7922 - modules of bases B, C are available; 9455, 8997 -base
                   module C is available.   */

                    data = new Data();

                    ioData.outPutInfoForUser("Enter the password: ");
                    data.add(ioData.inPutDouble());  // put entered password(number) in collection

                    ExpressionService levelAccess = new ExpressionService();
                    ioData.outPutInfoForUserNextLine("Your level of access = " + levelAccess.definitionOfAccessLevel(data.get(0)));

                    break;
                case (0):
                    break;
                default:
                    ioData.outPutInfoForUserNextLine("This task doesn't exist");
                    break;
            }
        } while (taskNumber != 0);
        ioData.outPutInfoForUserNextLine("You had left from branching tasks");
    }
}
