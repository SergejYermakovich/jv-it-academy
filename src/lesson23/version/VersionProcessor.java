package lesson23.version;

import java.lang.reflect.Field;

public class VersionProcessor {

    static void processAnnotation(Object object) throws NoSuchFieldException {
        Class<?> objectClass = object.getClass();

        Field field = objectClass.getField("currentVersion");
        if (field.isAnnotationPresent(Version.class)) {
            Version version = field.getAnnotation(Version.class);
            System.out.println(version.info());
        }

    }
}
