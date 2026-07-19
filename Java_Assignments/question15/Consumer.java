package question15;

import java.io.FileWriter;

class Consumer extends Thread {
    Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            FileWriter fw = new FileWriter("productamount.dat");

            while (true) {
                Product p = buffer.consume();

                double amount = p.qty * p.price + (0.1 * p.price);

                String data = p.id + ":" + p.name + ":" + p.qty + ":" + p.price + ":" + amount + "\n";

                fw.write(data);
                fw.flush();
            }

        } catch (Exception e) {
        }
    }
}
