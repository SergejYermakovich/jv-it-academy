package lesson23.lesson;

import java.lang.reflect.Field;

public class Main {

    Program program;


    public static void main(String[] args) throws NoSuchFieldException {
        Class<?> programClass = Program.class;

        Field currentVersion = programClass.getDeclaredField("currentVersion");

        if (currentVersion.isAnnotationPresent(Version.class)) {
            Version annotation = currentVersion.getAnnotation(Version.class);

            System.out.println(annotation.value());
            System.out.println(annotation.developer());
        }


    }
}
