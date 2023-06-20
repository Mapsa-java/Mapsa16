package com.mapsa.callable;

import java.util.concurrent.*;

public class CallableDemo {
	
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		
		ExecutorService es = Executors.newCachedThreadPool();
		Future<Integer> future = es.submit(() ->{
			try {
				TimeUnit.SECONDS.sleep(2);

			}catch (InterruptedException e){
				System.out.println("Got interrupted");
			}
			return 2;
		});
		//future.
		es.shutdown();

		System.out.println(future.get());
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println(future.cancel(true));
		System.out.println("last Line");



	}

}
