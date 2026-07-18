package question14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class StudentObjectRead {

    public static void main(String[] args) {

        ArrayList<Student> list = null;

        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("students.dat"));

            list = (ArrayList<Student>) ois.readObject();

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading object");
        }

        System.out.println("Student List:");

        if (list != null) {
            for (Student s : list) {
                System.out.println(s);
            }
        }
    }
}
