package lesson23.customAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodCaller {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Test object = new Test();

        for (Method method: object.getClass().getMethods()) {
            if (method.getAnnotation(Executable.class) != null) {
                method.invoke(object);
            }
        }
    }
}
