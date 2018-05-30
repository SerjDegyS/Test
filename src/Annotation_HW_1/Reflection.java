package Annotation_HW_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class Reflection {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NullPointerException {
        AnnotationMethod annotationMethod = new AnnotationMethod();

        final Class<?> cls = annotationMethod.getClass();

        Method[] methods = cls.getDeclaredMethods();

        try {
            for (Method method : methods)
                if (method.isAnnotationPresent(Test.class)) {
                    System.out.println("Method " + method.getName() +
                            " is marked with " + Arrays.toString(method.getDeclaredAnnotations()));
                    System.out.println("Signature of method " + method.getName() + ": " +
                            method.toString()
                    );
                    Test test = method.getAnnotation(Test.class);
                    System.out.println("Invoked method result: ");
                    method.invoke(annotationMethod, test.a(), test.b());
                }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
