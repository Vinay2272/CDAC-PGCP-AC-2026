package question10;

import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Apple");
        v.add("Banana");
        v.add("Mango");
        v.add("Orange");

        System.out.println("Elements in Vector:");

        Enumeration<String> e = v.elements();

        while (e.hasMoreElements()) {
            String str = e.nextElement();
            System.out.println(str);
        }
    }
}