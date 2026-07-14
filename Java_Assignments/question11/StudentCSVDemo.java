package question11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentCSVDemo {

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
                    writeToCSV(list);
                    System.out.println("Data saved to file. Exiting...");
                    break;
            }

        } while (choice != 3);
    }

    static void writeToCSV(ArrayList<Student> list) {
        try {
            FileWriter fw = new FileWriter("students.csv");

            for (Student s : list) {
                fw.write(s.toCSV() + "\n");
            }

            fw.close();

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}

