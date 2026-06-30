package Assignment;
import java.util.Scanner;

	class studentgpa {
	    int studid;
	    String name;
	    int m1, m2, m3;
	    double gpa;

	    void acceptData(Scanner sc) {
	        System.out.print("Enter Student ID: ");
	        studid = sc.nextInt();

	        System.out.print("Enter Name: ");
	        name = sc.next();

	        System.out.print("Enter Marks M1: ");
	        m1 = sc.nextInt();

	        System.out.print("Enter Marks M2: ");
	        m2 = sc.nextInt();

	        System.out.print("Enter Marks M3: ");
	        m3 = sc.nextInt();
	    }

	    double calculateGPA() {
	        gpa = (1.0/3)*m1 + (1.0/2)*m2 + (1.0/4)*m3;
	        return gpa;
	    }

	    void display() {
	        System.out.println("ID: " + studid);
	        System.out.println("Name: " + name);
	        System.out.println("M1: " + m1 + " M2: " + m2 + " M3: " + m3);
	    }
	}

class question3 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();

	        studentgpa[] s = new studentgpa[n];

	        for (int i = 0; i < n; i++) {
	            s[i] = new studentgpa();
	            System.out.println("Enter details for student " + (i + 1));
	            s[i].acceptData(sc);
	        }

	        int choice;
	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1. Display All Students");
	            System.out.println("2. Search by ID");
	            System.out.println("3. Search by Name");
	            System.out.println("4. Calculate GPA of a Student");
	            System.out.println("5. Exit");

	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    for (studentgpa st : s) {
	                        st.display();
	                        System.out.println("----------------");
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter ID to search: ");
	                    int id = sc.nextInt();
	                    boolean found = false;

	                    for (studentgpa st : s) {
	                        if (st.studid == id) {
	                            st.display();
	                            found = true;
	                        }
	                    }
	                    if (!found)
	                        System.out.println("Student not found");
	                    break;

	                case 3:
	                    System.out.print("Enter Name to search: ");
	                    String nm = sc.next();
	                    found = false;

	                    for (studentgpa st : s) {
	                        if (st.name.equalsIgnoreCase(nm)) {
	                            st.display();
	                            found = true;
	                        }
	                    }
	                    if (!found)
	                        System.out.println("Student not found");
	                    break;

	                case 4:
	                    System.out.print("Enter ID to calculate GPA: ");
	                    id = sc.nextInt();
	                    found = false;

	                    for (studentgpa st : s) {
	                        if (st.studid == id) {
	                            double gpa = st.calculateGPA();
	                            System.out.println("GPA of " + st.name + " = " + gpa);
	                            found = true;
	                        }
	                    }
	                    if (!found)
	                        System.out.println("Student not found");
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } while (choice != 5);

	        sc.close();
	    }
	}

