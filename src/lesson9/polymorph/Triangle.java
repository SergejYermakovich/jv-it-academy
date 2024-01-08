package lesson9.polymorph;

public class Triangle implements GeometryCalculable {

    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public int calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
