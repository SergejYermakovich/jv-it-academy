package lesson15.tasksResolved;

import java.io.*;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();

        // Записываем случайные числа в двоичный файл
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("numbers.bin"))) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
                out.writeInt(numbers[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Читаем числа из файла и выводим на экран
        int sum = 0;
        try (DataInputStream in = new DataInputStream(new FileInputStream("numbers.bin"))) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = in.readInt();
                System.out.print(numbers[i] + " ");
                sum += numbers[i];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Считаем среднее арифметическое и выводим на экран
        double average = (double) sum / numbers.length;
        System.out.println("\nСреднее арифметическое: " + average);
    }
}
