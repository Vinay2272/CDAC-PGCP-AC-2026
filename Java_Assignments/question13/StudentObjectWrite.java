package question13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentObjectWrite {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter id, name, degree, email: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    String degree = sc.next();
                    String email = sc.next();

                    list.add(new Student(id, name, degree, email));
                    break;

                case 2:
                    for (Student s : list) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    writeObject(list);
                    System.out.println("Data stored using ObjectOutputStream");
                    break;
            }

        } while (choice != 3);
    }

    static void writeObject(ArrayList<Student> list) {
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("students.dat"));

            oos.writeObject(list);

            oos.close();

        } catch (IOException e) {
            System.out.println("Error writing object");
        }
    }
}
