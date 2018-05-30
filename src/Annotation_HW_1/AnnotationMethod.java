package Annotation_HW_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class AnnotationMethod {

    @Test(a = 2, b = 3)
    public void suma(int a, int b
    ){
        System.out.println("a + b = " + (a+b));
    }
}

