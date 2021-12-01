package by.putseta.task01.service;

public class GeometricService {

    public double countAreaOfRectangle(double x) {  // calculates the area of the rectangle
        return 3 * x;
    }

    public double countAreaOfTriangle(double x) {
        return x * x * Math.sqrt(3) / 4;
    } // calculates the area of an equilateral triangle

    public double countHeightOfTriangle(double x) {
        return x * Math.sqrt(3) / 2;
    } // calculates the height of an equilateral triangle

    public double countInscribedCircleRadius(double x) {
        return x * Math.sqrt(3) / 6;
    } //calculates the inscribed circle radius of an equilateral triangle

    public double countCircumscribedCircleRadius(double x) {
        return x * Math.sqrt(3) / 3;
    } // //calculates the circumscribed circle radius of an equilateral triangle


}
