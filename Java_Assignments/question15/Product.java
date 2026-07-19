package question15;

import java.io.Serializable;

class Product implements Serializable {
    int id;
    String name;
    int qty;
    double price;

    public Product(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}