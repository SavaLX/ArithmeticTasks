package by.putseta.task01.controller;

import by.putseta.task01.entity.Data;
import by.putseta.task01.service.ExpressionService;
import by.putseta.task01.view.IoData;

/**
 * Class for run the additional tasks
 */
public class RunnerAdditionalTasks {

    private final IoData ioData = new IoData();

    /**
     * Here start point of solving additional task
     */
    public void runAdditionalTask() {

        Data data = new Data();
        ExpressionService expressionService = new ExpressionService();

        ioData.outPutInfoForUserNextLine("If you want to solve additional task please enter '1' or if you want to exit please " +
                "enter another number");
        if (ioData.inPutInt() == 1) {
            ioData.outPutInfoForUser("Enter the first number: ");
            data.add(ioData.inPutInt());
            ioData.outPutInfoForUser("Enter the second number: ");
            data.add(ioData.inPutInt());

            ioData.outPutInfoForUserNextLine("First way to swap numbers");
            expressionService.swapEnteredNumbersFirstWay((int) data.get(0), (int) data.get(1));

            ioData.outPutInfoForUserNextLine("Second way to swap numbers");
            expressionService.swapEnteredNumbersSecondWay((int) data.get(0), (int) data.get(1));

            ioData.outPutInfoForUserNextLine("Third way to swap numbers");
            expressionService.swapEnteredNumbersThirdWay((int) data.get(0), (int) data.get(1));

        }

    }
}
