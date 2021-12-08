package test.training.task01.service;

import by.putseta.task01.service.ArithmeticService;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArithmeticServiceTest {

    static final double delta = 0.0001;

    private final ArithmeticService arithmeticService = new ArithmeticService();

    @DataProvider(name = "dataForCalculatingAverageValue")
    public Object[][] createDataForCalculatingAverageValue() {
        return new Object[][]{
                {new double[]{1, 3}, 2},
                {new double[]{0, 0}, 0},
                {new double[]{-1, 3}, 1},
                {new double[]{0, 1}, 0.5},
                {new double[]{-2, -4}, -3},
        };
    }

    @Test(description = "check for finding the arithmetic average value", dataProvider = "dataForCalculatingAverageValue")
    public void checkDataForCalculatingAverageValue(double[] arg, double expected) {
        double actual = arithmeticService.countAverageValue(arg[0], arg[1]);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForCalculatingResultOfFunction")
    public Object[][] createForCalculatingResultOfFunction() {
        return new Object[][]{
                {new double[]{1, 0, 0, 0}, 0.0},
                {new double[]{0, 1, 0, 0}, 0.0},
                {new double[]{0, 0, 1, 0}, 1.0},
                {new double[]{0, 0, 0, 1}, 0.0},
                {new double[]{4, 2, 9, 1}, 15.0},
                {new double[]{-2, 0, 5, -1.5}, 0.5},
        };
    }

    @Test(description = "check for finding the value of expression module", dataProvider = "dataForCalculatingResultOfFunction")
    public void countExpressionModule(double[] arg, double expected) {
        double actual = arithmeticService.countExpressionModule(arg[0], arg[1], arg[2], arg[3]);
        Assert.assertEquals(actual, expected, delta);
    }
}
