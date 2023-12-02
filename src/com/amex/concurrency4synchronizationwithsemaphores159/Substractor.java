package com.amex.concurrency4synchronizationwithsemaphores159;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Substractor implements Callable<Value> {
	private Value v;
	private Lock lock;

	Substractor(Value x, Lock y) {
		this.v = x;
		lock = y;
	}

	@Override
	public Value call() throws Exception {

		for (int i = 0; i < 50; i++) {
			System.out.println("Substractor got the lock for  "+i);
			lock.lock();
			this.v.value -= i;
			lock.unlock();
		}

		return null;
	}

}
