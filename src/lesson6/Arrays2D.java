package lesson6;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
//        int[][] array = new int[2][2];
//
//        array[0][0] = 1;
//        array[0][1] = 2;
//        array[1][0] = 3;
//        array[1][1] = 4;

        int[][] array = {
                {1, 23, 3},
                {34, 45, 3},
                {34, 45, 3}
        };

//        for (int []simpleArray: array) {
//            System.out.println(Arrays.toString(simpleArray));
//        }


        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}
