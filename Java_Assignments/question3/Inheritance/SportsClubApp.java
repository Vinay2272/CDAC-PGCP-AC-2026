package Inheritance;

import java.util.*;

public class SportsClubApp {
    static List<Employee> empList = new ArrayList<>();
    static List<Member> memList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add Employee");
            System.out.println("2.Display Employees by Type");
            System.out.println("3.Search by ID");
            System.out.println("4.Search by Name");
            System.out.println("5.Display All Employees");
            System.out.println("6.Calculate Salary by Designation");
            System.out.println("7.Display 5 Employees by Department");
            System.out.println("8.Exit");

            choice = sc.nextInt();

            switch(choice) {

            case 1:
                System.out.println("1.Salaried 2.Contract 3.Vendor");
                int type = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter name, mobile, email, dept, desg, doj:");
                String n = sc.nextLine();
                String m = sc.nextLine();
                String e = sc.nextLine();
                String d = sc.nextLine();
                String desg = sc.nextLine();
                String doj = sc.nextLine();

                if(type == 1) {
                    System.out.println("Enter basic salary:");
                    double b = sc.nextDouble();
                    empList.add(new SalariedEmp(n,m,e,d,desg,doj,b));
                } else if(type == 2) {
                    System.out.println("Enter hours & rate:");
                    int h = sc.nextInt();
                    double r = sc.nextDouble();
                    empList.add(new ContractEmp(n,m,e,d,desg,doj,h,r));
                } else {
                    System.out.println("Enter noOfEmp & amount:");
                    int ne = sc.nextInt();
                    double amt = sc.nextDouble();
                    empList.add(new Vendor(n,m,e,d,desg,doj,ne,amt));
                }
                break;

            case 2:
                System.out.println("1.Salaried 2.Contract 3.Vendor");
                int t = sc.nextInt();
                for(Employee emp : empList) {
                    if((t==1 && emp instanceof SalariedEmp) ||
                       (t==2 && emp instanceof ContractEmp) ||
                       (t==3 && emp instanceof Vendor)) {
                        emp.display();
                    }
                }
                break;

            case 3:
                System.out.println("Enter ID:");
                int id = sc.nextInt();
                for(Employee emp : empList) {
                    if(emp.getId() == id) {
                        emp.display();
                    }
                }
                break;

            case 4:
                System.out.println("Enter name:");
                sc.nextLine();
                String name = sc.nextLine();
                for(Employee emp : empList) {
                    if(emp.getName().equalsIgnoreCase(name)) {
                        emp.display();
                    }
                }
                break;

            case 5:
                for(Employee emp : empList) {
                    emp.display();
                }
                break;

            case 6:
                System.out.println("Enter designation:");
                sc.nextLine();
                String dg = sc.nextLine();
                for(Employee emp : empList) {
                    if(emp.getDesg().equalsIgnoreCase(dg)) {
                        System.out.println("Salary: " + emp.calculateSalary());
                    }
                }
                break;

            case 7:
                System.out.println("Enter department:");
                sc.nextLine();
                String dept = sc.nextLine();
                int count = 0;
                for(Employee emp : empList) {
                    if(emp.getDept().equalsIgnoreCase(dept) && count < 5) {
                        emp.display();
                        count++;
                    }
                }
                break;

            case 8:
                System.out.println("Exiting...");
                break;
            }
        } while(choice != 8);
    }
}