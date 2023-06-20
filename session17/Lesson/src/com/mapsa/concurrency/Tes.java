package com.mapsa.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Tes {

    public static void main(String[] args) {

        Executor ex = Executors.newSingleThreadExecutor() ;
        ex.execute(()-> {
            System.out.println("tasks started!!!");
        });
    }
}
