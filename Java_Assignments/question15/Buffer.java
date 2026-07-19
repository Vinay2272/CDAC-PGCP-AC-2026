package question15;

class Buffer {
    Product product;
    boolean available = false;

    synchronized void produce(Product p) {
        while (available) {
            try {
                wait();
            } catch (Exception e) {}
        }
        product = p;
        available = true;
        notify();
    }

    synchronized Product consume() {
        while (!available) {
            try {
                wait();
            } catch (Exception e) {}
        }
        available = false;
        notify();
        return product;
    }
}
