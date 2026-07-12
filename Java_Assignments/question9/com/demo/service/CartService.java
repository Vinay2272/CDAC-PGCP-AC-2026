package question9.com.demo.model;

import java.util.*;
import question9.com.demo.model.Product;

public class CartService {

    static List<Product> productList = new ArrayList<>();
    static Map<String, List<Product>> cartMap = new HashMap<>();

    static {
        productList.add(new Product(1, "Shoes", 3000, 10));
        productList.add(new Product(2, "Shirt", 1500, 20));
        productList.add(new Product(3, "Bag", 2000, 15));
        productList.add(new Product(4, "Watch", 5000, 5));
        productList.add(new Product(5, "Mobile", 20000, 8));
        productList.add(new Product(6, "Laptop", 60000, 3));
        productList.add(new Product(7, "Headphones", 2000, 12));
        productList.add(new Product(8, "Keyboard", 1500, 10));
        productList.add(new Product(9, "Mouse", 800, 25));
        productList.add(new Product(10, "Bottle", 300, 30));
    }

    public void buyProduct(Scanner sc) {
        System.out.print("Enter username: ");
        String uname = sc.next();

        System.out.println("Available Products:");
        for (Product p : productList) {
            System.out.println(p.getId() + ". " + p.getName() + " Price: " + p.getPrice());
        }

        System.out.print("Enter product id: ");
        int pid = sc.nextInt();

        Product selected = null;
        for (Product p : productList) {
            if (p.getId() == pid) {
                selected = p;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Invalid product");
            return;
        }

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        if (qty > selected.getQty()) {
            System.out.println("Not enough stock");
            return;
        }

        double amount = qty * selected.getPrice();
        System.out.println("Amount = " + amount);

        Product cartItem = new Product(selected.getId(), selected.getName(), selected.getPrice(), qty);

        cartMap.putIfAbsent(uname, new ArrayList<>());
        cartMap.get(uname).add(cartItem);

        selected.setQty(selected.getQty() - qty);
    }

    public void deliverCart(Scanner sc) {
        if (cartMap.isEmpty()) {
            System.out.println("No carts available");
            return;
        }

        System.out.println("Users:");
        for (String user : cartMap.keySet()) {
            System.out.println(user);
        }

        System.out.print("Enter username: ");
        String uname = sc.next();

        List<Product> cart = cartMap.get(uname);

        if (cart == null) {
            System.out.println("User not found");
            return;
        }

        double total = 0;

        System.out.println("Bill:");
        for (Product p : cart) {
            double amt = p.getQty() * p.getPrice();
            total += amt;
            System.out.println(p.getName() + " " + p.getQty() + " " + amt);
        }

        System.out.println("Total = " + total);

        System.out.print("Deliver? (y/n): ");
        char ch = sc.next().charAt(0);

        if (ch == 'y' || ch == 'Y') {
            System.out.println("Order delivered");
            cartMap.remove(uname);
        }
    }
}