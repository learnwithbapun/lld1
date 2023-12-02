
package com.amex.concurrency4synchronizationwithsemaphores159;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
        public static void main(String[] args) {
        	
        	Lock lock = new ReentrantLock();
        	
                Value value = new Value();
                Adder adder = new Adder(value, lock);
                Substractor substractor = new Substractor(value, lock);
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
