package com.amex.introtosynchronization;

import java.util.concurrent.Callable;

public class Substractor implements Callable<Value> {
        private Value v;

        Substractor(Value x) {
                this.v = x;
        }

        @Override
        public Value call() throws Exception {

                for (int i = 0; i < 5000; i++) {
                        this.v.value -= i;
                }

                return null;
        }

}
