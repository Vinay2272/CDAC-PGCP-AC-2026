package Assignment;

import java.util.Scanner;

class Friend {
	    int id;
	    String name;
	    String lastname;
	    String[] hobbies;
	    String mobno;
	    String email;
	    String bdate;
	    String address;

	    void acceptData(Scanner sc) {
	        System.out.print("Enter ID: ");
	        id = sc.nextInt();

	        System.out.print("Enter First Name: ");
	        name = sc.next();

	        System.out.print("Enter Last Name: ");
	        lastname = sc.next();

	        System.out.print("Enter number of hobbies: ");
	        int n = sc.nextInt();
	        hobbies = new String[n];

	        System.out.println("Enter hobbies:");
	        for (int i = 0; i < n; i++) {
	            hobbies[i] = sc.next();
	        }

	        System.out.print("Enter Mobile No: ");
	        mobno = sc.next();

	        System.out.print("Enter Email: ");
	        email = sc.next();

	        System.out.print("Enter Birthdate: ");
	        bdate = sc.next();

	        sc.nextLine(); // clear buffer
	        System.out.print("Enter Address: ");
	        address = sc.nextLine();
	    }

	    void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name + " " + lastname);
	        System.out.print("Hobbies: ");
	        for (String h : hobbies) {
	            System.out.print(h + " ");
	        }
	        System.out.println();
	        System.out.println("Mobile: " + mobno);
	        System.out.println("Email: " + email);
	        System.out.println("Birthdate: " + bdate);
	        System.out.println("Address: " + address);
	        System.out.println("-------------------------");
	    }

	    boolean hasHobby(String h) {
	        for (String hobby : hobbies) {
	            if (hobby.equalsIgnoreCase(h)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}

	 class FriendInfo {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of friends: ");
	        int n = sc.nextInt();

	        Friend[] f = new Friend[n];

	        // Accept data
	        for (int i = 0; i < n; i++) {
	            f[i] = new Friend();
	            System.out.println("\nEnter details for Friend " + (i + 1));
	            f[i].acceptData(sc);
	        }

	        int choice;
	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1. Display All Friends");
	            System.out.println("2. Search by ID");
	            System.out.println("3. Search by Name");
	            System.out.println("4. Display Friends by Hobby");
	            System.out.println("5. Exit");

	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    for (Friend fr : f) {
	                        fr.display();
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter ID: ");
	                    int id = sc.nextInt();
	                    boolean found = false;

	                    for (Friend fr : f) {
	                        if (fr.id == id) {
	                            fr.display();
	                            found = true;
	                        }
	                    }
	                    if (!found)
	                        System.out.println("Friend not found");
	                    break;

	                case 3:
	                    System.out.print("Enter Name: ");
	                    String name = sc.next();
	                    found = false;

	                    for (Friend fr : f) {
	                        if (fr.name.equalsIgnoreCase(name)) {
	                            fr.display();
	                            found = true;
	                        }
	                    }
	                    if (!found)
	                        System.out.println("Friend not found");
	                    break;

	                case 4:
	                    System.out.print("Enter Hobby: ");
	                    String hobby = sc.next();
	                    found = false;

	                    for (Friend fr : f) {
	                        if (fr.hasHobby(hobby)) {
	                            fr.display();
	                            found = true;
	                        }
	                    }
	                    if (!found)
	                        System.out.println("No friend found with this hobby");
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

