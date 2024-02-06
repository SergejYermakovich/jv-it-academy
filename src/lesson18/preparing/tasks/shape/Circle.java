package lesson18.preparing.tasks.shape;

public class Circle extends Shape {

    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    double calculateSquare() {
        return Math.PI * radius * radius;
    }
}
