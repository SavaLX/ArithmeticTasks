package test.training.task01.service;

import by.putseta.task01.service.GeometricService;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GeometricServiceTest {

    GeometricService geometricService = new GeometricService();

    @DataProvider(name = "dataForCountAreaOfRectangle")
    public Object[][] createDataForAreaRectangle() {
        return new Object[][]{
                {new double[]{1}, 3},
                {new double[]{0}, 0},
                {new double[]{5}, 15},
        };
    }

    @Test(description = "check for counting the area of rectangle", dataProvider = "dataForCountAreaOfRectangle")
    public void checkAreaOfRectangle(double arg[], double expected) {
        double actual = geometricService.countAreaOfRectangle(arg[0]);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForCountAreaOfTriangle")
    public Object[][] createDataForAreaTriangle() {
        return new Object[][]{
                {new double[]{2}, 1.732},   //TODO: make result more accurate
                {new double[]{1}, 0.433},
                {new double[]{12}, 62.353},
        };
    }

    @Test(description = "check for counting the area of triangle", dataProvider = "dataForCountAreaOfTriangle")
    public void checkAreaOfTriangle(double arg[], double expected) {
        double actual = geometricService.countAreaOfTriangle(arg[0]);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForCountHeightOfTriangle")
    public Object[][] createDataForHeightTriangle() {
        return new Object[][]{
                {new double[]{2}, 1.73205081},   //TODO: make result more accurate
                {new double[]{1}, 0.866025404},
                {new double[]{12}, 10.3923049},
        };
    }

    @Test(description = "check for counting the area of triangle", dataProvider = "dataForCountHeightOfTriangle")
    public void checkHeightOfTriangle(double arg[], double expected) {
        double actual = geometricService.countHeightOfTriangle(arg[0]);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForCountInscribedCircleRadiusOfTriangle")
    public Object[][] createForCountInscribedCircleRadiusOfTriangle() {
        return new Object[][]{
                {new double[]{2}, 0.577},
                {new double[]{1}, 0.288},  //TODO: make result more accurate
                {new double[]{12}, 3.464},
        };
    }

    @Test(description = "check for counting the area of triangle", dataProvider = "dataForCountInscribedCircleRadiusOfTriangle")
    public void checkInscribedCircleRadiusOfTriangle(double arg[], double expected) {
        double actual = geometricService.countInscribedCircleRadius(arg[0]);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForCountCircumscribedCircleRadiusOfTriangle")
    public Object[][] createForCountCircumscribedCircleRadiusOfTriangle() {
        return new Object[][]{
                {new double[]{2}, 1.15470054},
                {new double[]{1}, 0.577350269},  //TODO: make result more accurate
                {new double[]{12}, 6.92820323},
        };
    }

    @Test(description = "check for counting the area of triangle", dataProvider = "dataForCountCircumscribedCircleRadiusOfTriangle")
    public void checkCircumscribedCircleRadiusOfTriangle(double arg[], double expected) {
        double actual = geometricService.countCircumscribedCircleRadius(arg[0]);
        Assert.assertEquals(actual, expected);
    }
}
