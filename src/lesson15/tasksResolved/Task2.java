package lesson15.tasksResolved;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String text = "Это пример текста! Он содержит несколько предложений. Каждое предложение заканчивается знаком препинания.";

        // создаем файл и записываем в него текст
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int wordCount = 0;
        int punctuationCount = 0;

        // читаем файл и подсчитываем слова и знаки препинания
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // подсчитываем слова
                wordCount += line.split("\\s+").length;

                // подсчитываем знаки препинания
                Pattern pattern = Pattern.compile("[.,!?;:]");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    punctuationCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // выводим результат на экран
        System.out.println("Количество слов: " + wordCount);
        System.out.println("Количество знаков препинания: " + punctuationCount);
    }
}