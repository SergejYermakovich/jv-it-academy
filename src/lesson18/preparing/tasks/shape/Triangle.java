package lesson18.preparing.tasks.shape;

public class Triangle extends Shape {

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    double calculateSquare() {
        return firstSide * secondSide * thirdSide / 2;
    }
}
