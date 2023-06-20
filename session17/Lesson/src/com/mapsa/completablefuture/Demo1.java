package com.mapsa.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		 CompletableFuture<Void> res =  CompletableFuture.runAsync(() -> {
			System.out.println("Thread1 name: " + Thread.currentThread().getName());
			System.out.println("Http call 1 goes here...");
		});
		System.out.println("res : " + res.get());
		TimeUnit.SECONDS.sleep(2);
		
		ExecutorService es = Executors.newCachedThreadPool();
		CompletableFuture.runAsync(() -> {
			System.out.println("Thread2 name: " + Thread.currentThread().getName());
			System.out.println("Http call 2 goes here...");
		}, es);
		
		es.shutdown();
		
	}

}
