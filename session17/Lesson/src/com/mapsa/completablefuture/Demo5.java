package com.mapsa.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Demo5 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Request User Profile from external API...");
            return "Some String representation of User Profile";
        }).thenAccept((result) -> {
            System.out.println("User Profile Received: " + result);
        });

        System.out.println(future.get());

        var es = Executors.newCachedThreadPool();
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Request User Profile from external API...");
            return "Some String representation of User Profile";
        }).thenAcceptAsync((result) -> {
            System.out.println("User Profile Received: " + result);
        }, es);

        es.shutdown();
    }


	/*public static void main(String[] args) throws ExecutionException, InterruptedException {
	*//*	CompletableFuture<String> wsResultPerson = findPerson();
		System.out.println(wsResultPerson.get());*//*

	*//*	CompletableFuture<String> wsResultFindPersonAddressByName = findPersonAddressByName("Ali");
		System.out.println(wsResultFindPersonAddressByName.get());*//*

		//findPerson().thenApply((item)->findPersonAddressByName(item)).


	}
    public static CompletableFuture<String> findPerson() {

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Request User Profile from external API...");
            return "Ali";
        });
    }

	public static CompletableFuture<String> findPersonAddressByName(String name) {

		return CompletableFuture.supplyAsync(() -> {
			System.out.println("Request User Profile from external API...");
			return name + " address";
		});
	}
*/


}
