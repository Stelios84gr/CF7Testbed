package gr.aueb.cf.ch19.streams;

import java.util.*;
import java.util.stream.Collectors;


public class test {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Milk", 2.20, 2),
                new Product("Eggs", 1.5, 5),
                new Product("Honey", 8.30, 2));

        List<String> sortedProductsByPrice = products.stream().filter(product -> product.getQuantity() == 2).sorted(Comparator.comparing(Product::getName)).map(Product::getName).collect(Collectors.toList());

        sortedProductsByPrice.forEach(System.out::println);
    }
}
