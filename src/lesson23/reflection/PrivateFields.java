package lesson23.reflection;

import lesson23.lesson.Program;

import java.lang.reflect.Field;

public class PrivateFields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> programClass = Class.forName("lesson23.lesson.Program");
        Object program = programClass.newInstance(); // -> Program program = new Program()

        Field field = Program.class.getDeclaredField("year");
        field.setAccessible(true);
        System.out.println(field.get(program));
        field.set(program, 2024);
        System.out.println(field.get(program));

        Field[] allFields = programClass.getFields();

        for (Field f : allFields) {
            System.out.println(f);
        }

    }
}
