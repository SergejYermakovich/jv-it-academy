package lesson9.polymorph;

public class Main {
    public static void main(String[] args) {
        GeometryCalculable square = new Square(4,4,4,4);
        GeometryCalculable triangle = new Triangle(3,3,2);

        GeometryCalculable[] array = new GeometryCalculable[2];
        array[0] = square;
        array[1] = triangle;


        for (GeometryCalculable geo: array) {
            System.out.println("Perimeter: "  + geo.calculatePerimeter());
        }
    }
}
