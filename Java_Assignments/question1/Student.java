package Assignment;
import java.util.Scanner;
public class Student {

	    int studid;
	    String name;
	    int m1, m2, m3;

	    
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

	    
	    void displayData() {
	        System.out.println("Student Details:");
	        System.out.println("____________");
	        System.out.println("Student Id: " + studid);
	        System.out.println("Name: " + name);
	        System.out.println("M1: " + m1);
	        System.out.println("M2: " + m2);
	        System.out.println("M3: " + m3);
	        System.out.println("----------------------");
	    }
	}
class StudentInfo {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        
	        Student s1 = new Student();
	        
	        Student s2 = new Student();

	        
	        System.out.println("Enter details for Student 1:");
	        s1.acceptData(sc);

	        System.out.println("\nEnter details for Student 2:");
	        s2.acceptData(sc);

	        
	        System.out.println("\n--- Student Records ---");
	        s1.displayData();
	        s2.displayData();

	        sc.close();
	    }
	}

