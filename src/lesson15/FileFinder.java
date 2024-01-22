package lesson15;

import java.io.File;
import java.util.List;

public class FileFinder {
    public static void printFiles(File root) {
        File[] files = root.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("->" + file.getName());
                    printFiles(file);
                } else {
                    System.out.println( file.getName());}
                }
            }
        }
    }

