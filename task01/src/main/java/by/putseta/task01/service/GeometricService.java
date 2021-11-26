package by.putseta.task01.service;

public class GeometricService {

    public double countAreaOfRectangle(double x) {
        return 3 * x;
    }

    /*
 Counting values in an equilateral triangle
 */
    public double countAreaOfTriangle(double x) {
        return x * x * Math.sqrt(3) / 4;
    }

    public double countHeightOftriangle(double x) {
        return x * Math.sqrt(3) / 2;
    }

    public double countInscridedCircleRadius(double x) {
        return x * Math.sqrt(3) / 6;
    }

    public double countCircumscribedCircleRadius(double x) {
        return x * Math.sqrt(3) / 3;
    }


}
