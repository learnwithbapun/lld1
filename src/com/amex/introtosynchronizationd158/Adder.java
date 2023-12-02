package com.amex.introtosynchronizationd158;

import java.util.concurrent.Callable;

public class Adder implements Callable<Value> {

        private Value v;

        Adder(Value x) {
                this.v = x;
        }

        @Override
        public Value call() throws Exception {
                for (int i = 0; i < 5000; i++) {
                        this.v.value += i;
                }

                return null;
        }

}
