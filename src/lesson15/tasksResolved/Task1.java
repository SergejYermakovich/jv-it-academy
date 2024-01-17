package lesson15.tasksResolved;

import java.io.File;

/*
*
* Вывести список файлов и каталогов выбранного каталога на диске. Файлы и
каталоги должны быть распечатаны отдельно.

*
*
* */
public class Task1 {
    public static void main(String[] args) {
        File root = new File("D:\\rebase");

        for (File file: root.listFiles()) {
            System.out.println(file.getName());
        }

    }
}
