package question15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Producer extends Thread {
    Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("productdata.dat"));

            while (true) {
                Product p = (Product) ois.readObject();
                buffer.produce(p);
            }

        } catch (Exception e) {
        }
    }
}
