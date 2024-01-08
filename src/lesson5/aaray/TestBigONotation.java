package lesson5.aaray;

public class TestBigONotation {
    public static void main(String[] args) {
        int sum = 0;


        for (int j = 0; j < 10; j++) {
            sum += j;
        }

        for (int j = 0; j < 10; j++) {
            sum += j;
        }

        for (int j = 0; j < 10; j++) {
            sum += j;
        }

        for (int j = 0; j < 10; j++) {
            sum += j;
        }


        // 4 * n  -> n

        System.out.println(sum);
    }
}
