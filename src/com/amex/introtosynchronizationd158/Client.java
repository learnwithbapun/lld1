
package com.amex.introtosynchronizationd158;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
        public static void main(String[] args) {
                Value value = new Value();
                Adder adder = new Adder(value);
                Substractor substractor = new Substractor(value);
                ExecutorService executorService = Executors.newCachedThreadPool();
                Future<Value> future = executorService.submit(adder);
                Future<Value> future2 = executorService.submit(substractor);

                try {
                        Value result1 = future.get();
                        Value result2 = future2.get();
                } catch (Exception e) {
                        e.printStackTrace();
                }
                System.out.println(value.value);

        }
}
