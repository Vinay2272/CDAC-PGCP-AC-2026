package question16;

import java.util.*;
import java.util.concurrent.*;

class AddTask implements Callable<Integer> {

    private int a, b, c;

    public AddTask(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Integer call() {
        return a + b + c;
    }
}

