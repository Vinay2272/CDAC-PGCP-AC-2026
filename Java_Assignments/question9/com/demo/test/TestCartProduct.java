package question9.com.demo.model;

import java.util.Scanner;

import question9.com.demo.model.CartService;

public class TestCartProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CartService cs = new CartService();

        int choice;

        do {
            System.out.println("\n1. Buy Products");
            System.out.println("2. Send Delivery");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cs.buyProduct(sc);
                    break;

                case 2:
                    cs.deliverCart(sc);
                    break;
            }

        } while (choice != 3);
    }
}