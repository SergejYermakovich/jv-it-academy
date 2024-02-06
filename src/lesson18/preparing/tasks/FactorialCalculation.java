package lesson18.preparing.tasks;

public class FactorialCalculation {
    public static void main(String[] args) {
          System.out.println(getFactorial(12));
    }

    private static int getFactorial(int n) {
        if (n < 0) {
          throw new FactorialException("Вы передали отрицательное число.");
        }
        int factorial = 1;
        for (int i = n; i != 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

}
