package ExamSystem;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Question[] javaQ = {
            new Question(1,"Java is?","Language","OS","Browser","DB","1",1),
            new Question(2,"JVM stands for?","Java VM","Virtual Machine","Java Virtual Machine","None","3",1),
            new Question(3,"OOP means?","Object","Oriented","Object Oriented Programming","None","3",1),
            new Question(4,"Keyword for inheritance?","this","super","extends","final","3",1),
            new Question(5,"Default value of int?","0","1","null","undefined","1",1)
        };

        
        Question[] htmlQ = {
            new Question(1,"HTML stands for?","Hyper Text Markup Language","High Text","None","All","1",1),
            new Question(2,"Tag for link?","a","link","href","url","1",1),
            new Question(3,"Tag for image?","img","pic","src","image","1",1),
            new Question(4,"Tag for paragraph?","p","para","text","t","1",1),
            new Question(5,"HTML is?","Language","Programming","Markup","None","3",1)
        };

        Exam javaExam = new Exam(1,"Java Test","Java","10-04-2026",javaQ);
        Exam htmlExam = new Exam(2,"HTML Test","HTML","10-04-2026",htmlQ);

        char ch;

        do {
            System.out.println("\nSelect Exam:");
            System.out.println("1.Java");
            System.out.println("2.HTML");

            int choice = sc.nextInt();

            if(choice == 1) {
                javaExam.conductExam();
            } else {
                htmlExam.conductExam();
            }

            System.out.println("Do you want to continue? (y/n)");
            ch = sc.next().charAt(0);

        } while(ch == 'y' || ch == 'Y');
    }
}