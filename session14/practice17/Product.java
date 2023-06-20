package com.mapsa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;
    private Category category;
    private boolean inStock;

    private static List<Product> allProducts = new ArrayList<>(Arrays.asList(
            new Product(1, "iPhone 12", 999.99, Category.ELECTRONICS, true),
            new Product(2, "T-Shirt", 19.99, Category.CLOTHING, true),
            new Product(3, "Harry Potter", 14.99, Category.BOOKS, false),
            new Product(4, "Perfume", 59.99, Category.BEAUTY, true),
            new Product(5, "Football", 24.99, Category.SPORTS, true),
            new Product(6, "Laptop", 1299.99, Category.ELECTRONICS, true),
            new Product(7, "Jeans", 49.99, Category.CLOTHING, true),
            new Product(8, "The Great Gatsby", 9.99, Category.BOOKS, true),
            new Product(9, "Shampoo", 12.99, Category.BEAUTY, true),
            new Product(10, "Basketball", 19.99, Category.SPORTS, false)
    ));
    public Product(int i, String s, double v, Category electronics, boolean b) {
    }

    // write getters, and setters
    // ...




    public static List<Product> getAllProducts() {
        return allProducts;
    }
}