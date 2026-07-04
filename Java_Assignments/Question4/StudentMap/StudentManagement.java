package Question4.StudentMap;

import java.util.*;

public class StudentManagement {
    static Map<Student, Set<String>> map = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n1.Add Student\n2.Add Skill\n3.Delete Student");
            System.out.println("4.Delete Skill\n5.Display by Skill");
            System.out.println("6.Display by Degree\n7.Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter id, name, degree, marks: ");
                    Student s = new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
                    map.put(s, new HashSet<>());
                    break;

                case 2:
                    System.out.print("Enter student id: ");
                    int id = sc.nextInt();
                    for (Student st : map.keySet()) {
                        if (st.getSid() == id) {
                            System.out.print("Enter skill: ");
                            map.get(st).add(sc.next());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student id: ");
                    id = sc.nextInt();
                    map.keySet().removeIf(st -> st.getSid() == id);
                    break;

                case 4:
                    System.out.print("Enter student id: ");
                    id = sc.nextInt();
                    for (Student st : map.keySet()) {
                        if (st.getSid() == id) {
                            System.out.print("Enter skill to remove: ");
                            map.get(st).remove(sc.next());
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter skill: ");
                    String skill = sc.next();

                    for (Map.Entry<Student, Set<String>> entry : map.entrySet()) {
                        if (entry.getValue().contains(skill)) {
                            System.out.println(entry.getKey());
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter degree: ");
                    String deg = sc.next();

                    for (Student st : map.keySet()) {
                        if (st.getDegree().equalsIgnoreCase(deg)) {
                            System.out.println(st);
                        }
                    }
                    break;
            }

        } while (choice != 7);
    }
}
