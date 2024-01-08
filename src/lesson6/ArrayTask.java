package lesson6;

import java.util.Random;
import java.util.Scanner;

/*

1) ввести с клавиатуры размерность массива -> 2 числа
2) в цикле - заполняем числами рандомными
3) в цикле выводим на экран
4) диагональ заполнить нулями

* */
public class ArrayTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = random.nextInt(10);
                }

            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}
