package question12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSVStudent {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String degree = data[2];
                String email = data[3];

                list.add(new Student(id, name, degree, email));
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        System.out.println("Student List:");

        for (Student s : list) {
            System.out.println(s);
        }
    }
}