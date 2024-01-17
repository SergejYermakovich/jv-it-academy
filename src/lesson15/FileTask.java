package lesson15;

import java.io.File;

/*
* Задание 1
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и
каталоги должны быть распечатаны отдельно.

*
* */
public class FileTask {
// рекурсия
    public static void main(String[] args) {
        File directory = new File("D:\\rebase");

        for (File file: directory.listFiles()) {
            if (file.isDirectory()) {
                System.out.println("directory -> " + file.getName());
                printFilesFromDir(file);
            } else {
                System.out.println( file.getName());
            }
        }
    }
    static void printFilesFromDir(File directory) {
        for (File file: directory.listFiles()) {
            System.out.println( "\t\t\t" +file.getName());
        }
    }
}
