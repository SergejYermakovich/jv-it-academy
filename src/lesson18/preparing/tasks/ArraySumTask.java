package lesson18.preparing.tasks;

/*
 * 1. Напишите программу для вычисления суммы всех элементов массива.
 * */
public class ArraySumTask {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int sum = 0;

        for (int element : array) {
            sum += element;
        }

        System.out.println(sum);
    }
}
