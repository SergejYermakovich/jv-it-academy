package lesson5.test;


public class TestMethod {
    public static void main(String[] args) {

        int result = getSum(1, 2);
        System.out.println(result);
    }

      public static int getSum(int a, int b) { // 1 и 2
        int sum = a + b;
        return sum;
    }
}
