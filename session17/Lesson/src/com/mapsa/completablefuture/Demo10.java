package com.mapsa.completablefuture;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Demo10 {

	public static void main(String[] args) {
		List<String> messages = Arrays.asList("a", "b", "c");
		List<CompletableFuture<String>> futures = messages.stream()
				.map(msg -> {
					//System.out.println("defot : " + msg);
					return CompletableFuture.supplyAsync(() -> delayedUpperCase(msg)) ;
				})
				.collect(Collectors.toList());
		futures.forEach(item-> {
			try {
				System.out.println(item.get());
			} catch (InterruptedException | ExecutionException e) {
				throw new RuntimeException(e);
			}
		});
		CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
				.whenComplete((v, th) -> {

			futures.forEach(cf -> System.out.println( cf.getNow(null)) );
		});
	}
	
	static String delayedUpperCase(String s) {
	/*	System.out.println("here");
		System.out.println("s is " + s);*/
        randomSleep();
        return s.toUpperCase();
    }

    static void randomSleep() {
        try {
        	TimeUnit.MILLISECONDS.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
