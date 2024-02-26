package lesson23.reflection;

import lesson23.lesson.Program;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodRerflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> program = Class.forName("lesson23.lesson.Program");

        Method method = program.getMethod("setUp");

        Program programObject = (Program) program.newInstance();
        method.invoke(programObject, "name");

    }

}
