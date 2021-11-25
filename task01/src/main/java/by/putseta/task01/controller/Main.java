package by.putseta.task01.controller;

import by.putseta.task01.entity.Data;
import by.putseta.task01.service.ArithmeticService;
import by.putseta.task01.view.IoData;

public class Main {
    public static void main(String[] args) {

        Data data = new Data();
        IoData ioData = new IoData();


        IoData.doGreeting();

        switch (ioData.inPut()) {
            case (10):
                data.add(ioData.inPut()); // put first number in collection
                data.add(ioData.inPut()); // put second number in collection

                ArithmeticService average = new ArithmeticService();
                System.out.println("The average value = " + average.countAverageValue(data.get(0), data.get(1)));
                break;
            case (5):
                System.out.println("hi i am in case 5");
        }

    }

}
