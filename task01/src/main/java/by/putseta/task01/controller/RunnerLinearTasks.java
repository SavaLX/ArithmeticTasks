package by.putseta.task01.controller;

import by.putseta.task01.entity.Data;
import by.putseta.task01.service.ArithmeticService;
import by.putseta.task01.service.ExpressionService;
import by.putseta.task01.service.GeometricService;
import by.putseta.task01.view.IoData;

public class RunnerLinearTasks {
    private final IoData ioData = new IoData();

    public void runLinearTask() {
        Data data;
        int taskNumber;

        System.out.println("Hello! You can choose which of 5 linear tasks ( Available tasks : № 5 , 7, 19, 21, 33) " +
                "you want to solve");

        do {
            System.out.print("Enter number of task or enter the 0 to exit from linear task and go to branching tasks: ");
            taskNumber = ioData.inPutInt();
            switch (taskNumber) {
                case (5):     //Create an algorithm for finding the arithmetic mean of two numbers

                    data = new Data();

                    System.out.print("Enter the first number: ");
                    data.add(ioData.inPutDouble()); // put first number in collection
                    System.out.print("Enter the second number: ");
                    data.add(ioData.inPutDouble()); // put second number in collection

                    ArithmeticService average = new ArithmeticService();
                    System.out.println("The average value = " + average.countAverageValue(data.get(0), data.get(1)));

                    break;
                case (7):     //You are given a rectangle whose width is half the length. Find the area of a rectangle

                    data = new Data();

                    System.out.print("Enter the length of rectangle: ");
                    data.add(ioData.inPutDoublePositive()); // put length in collection

                    GeometricService rectangle = new GeometricService();
                    System.out.println("The area of rectangle = " + rectangle.countAreaOfRectangle(data.get(0)));

                    break;
                case (19):    /*The side of an equilateral triangle is given. Find the area of this triangle,
                its height, inscribed radii and circumscribed circles.*/

                    data = new Data();

                    System.out.print("Enter the side length of equilateral triangle: ");
                    data.add(ioData.inPutDoublePositive());  // put side length in collection

                    GeometricService triangle = new GeometricService();
                    System.out.println("Equilateral triangle area = " + triangle.countAreaOfTriangle(data.get(0)) + "\n" +
                            "Equilateral triangle height = " + triangle.countHeightOfTriangle(data.get(0)) + "\n" +
                            "The radius of the inscribed circle in an equilateral triangle = " +
                            triangle.countInscribedCircleRadius(data.get(0)) + "\n" +
                            "The radius of the circumscribed circle in an equilateral triangle = "
                            + triangle.countCircumscribedCircleRadius(data.get(0)));

                    break;
                case (21):      /*You are given a real number R of the form nnn.ddd (three digital digits in
                fractional and integer parts). Swap fractional and integer parts of the number and display the
                resulting value of the number*/

                    data = new Data();

                    System.out.print("Enter the real number R of the form nnn,ddd: ");
                    data.add(ioData.inPutDouble());  // put real number in collection

                    ExpressionService swap = new ExpressionService();
                    System.out.println("The resulting number when changing the fractional and integer parts = " +
                            swap.swapFractionalAndIntegerParts(data.get(0)));

                    break;
                case (33):    /*Enter any character and determine its ordinal number, as well as indicate the previous
                and subsequent characters. */

                    System.out.print("Enter the only one symbol: ");
                    ExpressionService symbol = new ExpressionService();

                    System.out.println("The ordinal number of the character in the Unicode table = " +
                            symbol.findOrdinalNumberOfSymbol(ioData.inPutOneSymbol()));
                    System.out.println("The previous symbol is: " + symbol.displayPreviousCharacter());
                    System.out.println("The next symbol is: " + symbol.displayNextCharacter());

                    break;
                case (0):
                    break;
                default:
                    System.out.println("This task doesn't exist");
                    break;
            }
        } while (taskNumber != 0);
        System.out.println("You had left from linear tasks");
    }
}
