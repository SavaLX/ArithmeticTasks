package test.training.task01.service;

import by.putseta.task01.service.ExpressionService;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExpressionServiceTest {

    ExpressionService expressionService = new ExpressionService();

    @DataProvider(name = "dataForSwapNumberParts")
    public Object[][] createDataForSwapNumberParts() {
        return new Object[][]{
                {new double[]{111.333}, 333.111},
                {new double[]{000.000}, 000.000},
                {new double[]{-111.222}, -222.111},
                {new double[]{999.888}, 888.999},
        };
    }

    @Test(description = "check for swap number parts", dataProvider = "dataForSwapNumberParts")
    public void checkPartsSwap(double[] arg, double expected) {
        double actual = expressionService.swapFractionalAndIntegerParts(arg[0]);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForFindSmallerNumber")
    public Object[][] createDataForFindSmallerNumber() {
        return new Object[][]{
                {new double[]{111.333, -1141}, -1141},
                {new double[]{-2452, -124, 242}, -2452},
                {new double[]{0, 242}, 0},
                {new double[]{-124.12, 0}, -124.12},
                {new double[]{-112.124, -112.123}, -112.124},
        };
    }

    @Test(description = "check for smaller number of 2 numbers", dataProvider = "dataForFindSmallerNumber")
    public void checkSmallerNumber(double[] arg, double expected) {
        double actual = expressionService.findSmallerNumber(arg[0], arg[1]);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForCountPositiveNumbers")
    public Object[][] createDataForCountPositiveNumbers() {
        return new Object[][]{
                {new double[]{111.333, -1141, 0}, 1},
                {new double[]{-2452, -124, 242}, 1},
                {new double[]{0, 0, 0}, 0},
                {new double[]{-124, -22, -12, 124}, 0},
                {new double[]{241, 24, 12, 242}, 3},
        };
    }

    @Test(description = "check for counting positive numbers of 3 entered numbers", dataProvider = "dataForCountPositiveNumbers")
    public void checkPositiveNumbers(double[] arg, double expected) {
        double actual = expressionService.countPositiveNumbers(arg[0], arg[1], arg[2]);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForFindAccessLevel")
    public Object[][] createDataForFindAccessLevel() {
        return new Object[][]{
                {new double[]{9583}, "A,B,C"},
                {new double[]{1747}, "A,B,C"},
                {new double[]{3331}, "B,C"},
                {new double[]{7922}, "B,C"},
                {new double[]{9455}, "C"},
                {new double[]{8997}, "C"},
                {new double[]{-244}, "No any access"},
                {new double[]{424}, "No any access"},
        };
    }

    @Test(description = "check for find access level", dataProvider = "dataForFindAccessLevel")
    public void checkAccessLevel(double[] arg, String expected) {
        String actual = expressionService.definitionOfAccessLevel(arg[0]);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForFindLargestDigitInNumber")
    public Object[][] createDataForFindLargestDigitInNumber() {
        return new Object[][]{
                {new int[]{954124}, 9},
                {new int[]{17}, 7},
                {new int[]{0}, 0},
                {new int[]{20929}, 9},
        };
    }

    @Test(description = "check for find largest digit in number", dataProvider = "dataForFindLargestDigitInNumber")
    public void checkLargestDigit(int[] arg, int expected) {
        int actual = expressionService.findLargestDigitInNumber(arg[0]);
        Assert.assertEquals(actual, expected);
    }

}
