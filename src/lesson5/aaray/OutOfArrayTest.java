package lesson5.aaray;

import java.util.Random;

public class OutOfArrayTest {
    public static void main(String[] args) {


        Random random;
        random = new Random();
        int[] grades = new int[10];


        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(10);
        }
    }
}
