package Annotation_HW_2;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Saver {
    public static void main(String[] args) throws NoSuchMethodException {
        TextContainer textCnt = new TextContainer();

        Class<?> cls = textCnt.getClass();
        if (cls.isAnnotationPresent(SaveTo.class))
            System.out.println("Class is market with annotation " +
                    SaveTo.class.getName());

        Method method = cls.getMethod("save", String.class);
        SaveTo sv = cls.getAnnotation(SaveTo.class);

        try {
            method.invoke(textCnt, sv.path());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
