package lesson23.lesson;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class AnnotationExample {
    public static void main(String[] args) {

        Class<?> programClass = Program.class;
        Annotation[] annotations = programClass.getAnnotations();
        Arrays.stream(annotations).forEach(Annotation::annotationType);
    }
}
