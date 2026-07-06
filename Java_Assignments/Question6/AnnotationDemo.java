package Question6;

import java.lang.reflect.Method;

public class AnnotationDemo {

    public static void main(String[] args) throws Exception {

        Class<MyClass> cls = MyClass.class;
        MyClass obj = new MyClass();

        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {

            
            if (m.isAnnotationPresent(CustomAnnotation.class)) {
                System.out.println("Invoking: " + m.getName());
                m.invoke(obj);
            }
            
            else {
                System.out.println("Not Annotated: " + m.getName());
            }
        }
    }
}