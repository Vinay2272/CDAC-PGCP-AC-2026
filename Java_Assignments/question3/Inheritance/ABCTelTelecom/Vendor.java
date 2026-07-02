package ABCTelTelecom;

import java.util.*;

class Vendor extends Person {
    private String phone;
    private List<String> products;

    public Vendor(String name, String email, String phone, List<String> products) {
        super(name, email);
        this.phone = phone;
        this.products = products;
    }

    public void display() {
        super.display();
        System.out.println("Phone: " + phone);
        System.out.println("Products: " + products);
    }
}
