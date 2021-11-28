package test.training.task01.service;

import by.putseta.task01.entity.Data;
import by.putseta.task01.service.ArithmeticService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticServiceTest {

    private final ArithmeticService arithmeticService = new ArithmeticService();
    Data data = new Data();

//    @DataProvider(name = "dataForCalculationAverageValue")
//    public Object[][] createDataForAverageValue() {
//        return new Object[][]{
//                {new double[]{1, 3}, 2},
//                {new double[]{0, 0}, 0},
//                {new double[]{-1, 3}, 1},
//                {new double[]{0, 0}, 0},
//        };
//    }

//    @Test(description = "check for finding the arithmetic mean with positive numbers", dataProvider = "dataForCalculationAverageValue")
//    public void checkAverageValue(double[] angles, double expected) {
//        data.add(angles [0]);
//        data.add(angles [1]);
//        double actual = expressionService.solveEquationWithSinCosTan(data); //TODO: написать с провайдером
//        data.remove(0);
//        data.remove(0);
//        assertEquals(actual, expected);
//
//    }

    @Test(description = "check for finding the arithmetic mean with positive numbers")
    public void correctData() {
        double first = 1;
        double second = 3;
        Assert.assertEquals(arithmeticService.countAverageValue(first, second), 2.0);
    }

    @Test(description = "check for finding the arithmetic mean with negative numbers")
    public void negativeCorrectData() {
        double first = -1;
        double second = -2;
        Assert.assertEquals(arithmeticService.countAverageValue(first, second), -1.5);
    }

    @Test(description = "check for finding the arithmetic mean with negative numbers")
    public void zeroCorrectData() {
        double first = 0;
        double second = 0;
        Assert.assertEquals(arithmeticService.countAverageValue(first, second), 0.0);
    }

}
