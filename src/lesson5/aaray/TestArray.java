package lesson5.aaray;

import java.util.Random;

public class TestArray {
    public static void main(String[] args) {
        Random random = new Random();

        int[] grades = new int[10];


        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(10);
        }

        for (int grade : grades) {
            System.out.print(grade + " ");
        }


        for (int i = 0; i < grades.length; i++) {
           if (grades[i] < 4) {
               grades[i] = 4;
           }
        }

        System.out.println();

        for (int grade : grades) {
            System.out.print(grade + " ");
        }




    }
}
