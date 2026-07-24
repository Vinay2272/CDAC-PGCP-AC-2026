package question16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {

    public static void main(String[] args) throws Exception {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 51; i++) {
            numbers.add(i);
        }

        ExecutorService es = Executors.newFixedThreadPool(5);

        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i += 3) {

            int a = numbers.get(i);
            int b = (i + 1 < numbers.size()) ? numbers.get(i + 1) : 0;
            int c = (i + 2 < numbers.size()) ? numbers.get(i + 2) : 0;

            AddTask task = new AddTask(a, b, c);

            Future<Integer> f = es.submit(task);
            futures.add(f);
        }

        int total = 0;

        for (Future<Integer> f : futures) {
            total += f.get();
        }

        System.out.println("Total Sum = " + total);

        es.shutdown();
    }
}

