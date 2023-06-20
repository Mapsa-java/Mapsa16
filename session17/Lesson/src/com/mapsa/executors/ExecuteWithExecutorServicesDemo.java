package com.mapsa.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteWithExecutorServicesDemo {
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		es.execute(() -> System.out.println("Hello from thread " + Thread.currentThread().getName()));
		es.execute(() -> System.out.println("Hello from thread " + Thread.currentThread().getName()));
		
	}

}
