package lesson23.reflection;

import lesson23.lesson.Program;

import java.util.Arrays;

public class ClassReflection {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> currentClass = Program.class;
        System.out.println(currentClass.getCanonicalName());
        System.out.println(Arrays.toString(currentClass.getMethods()));

        Class<?> program = Class.forName("lesson23.lesson.Program");


        Program programObject = (Program) program.newInstance();





    }
}
