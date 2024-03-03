package lesson24;

public class SwapTask {
    /*
    * Напишите программу на Java, чтобы поменять местами значения, хранящиеся в двух переменных, без использования третьей переменной
    *
    * */

    public static void main(String[] args) {
        int a = 9;
        int b = 10;

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("a " + a);
        System.out.println("b " + b);

    }
}
