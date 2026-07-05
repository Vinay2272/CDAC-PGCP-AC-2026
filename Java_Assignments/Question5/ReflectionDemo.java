package Question5;

import java.lang.reflect.*;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        Class<?>[] classes = {
                Rectangle.class,
                Student.class,
                Friend.class,
                MyClass.class
        };

        for (Class<?> cls : classes) {

            System.out.println("\nClass Name: " + cls.getName());

            Method[] methods = cls.getDeclaredMethods();

            Object obj = cls.getDeclaredConstructor().newInstance();

            for (Method m : methods) {

                System.out.println("\nMethod Name: " + m.getName());

                Parameter[] params = m.getParameters();

                System.out.println("Parameter Count: " + params.length);

                for (Parameter p : params) {
                    System.out.println("Param Name: " + p.getName() +
                                       " Type: " + p.getType().getSimpleName());
                }

                
                if (params.length >= 3) {

                    Object[] values = new Object[params.length];

                    for (int i = 0; i < params.length; i++) {
                        Class<?> type = params[i].getType();

                        if (type == int.class) values[i] = 1;
                        else if (type == double.class) values[i] = 1.0;
                        else if (type == String.class) values[i] = "test";
                        else values[i] = null;
                    }

                    System.out.println("Invoking method: " + m.getName());
                    m.invoke(obj, values);
                }
            }
        }
    }
}
