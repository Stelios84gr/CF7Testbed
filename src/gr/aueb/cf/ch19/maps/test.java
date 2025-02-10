package gr.aueb.cf.ch19.maps;

import gr.aueb.cf.ch19.streams.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {
        Map<String, Product> products = new HashMap<>() {{
            put("ORA", new Product("Oranges", 12.5, 19));
            put("HON", new Product("Honey", 10.5, 10));
            put("MIL", new Product("Milk", 3.8, 3));
            put("EGG", new Product("Eggs", 1.8, 1));
        }};

        System.out.println(products);

        int total = products.values().stream().filter(product -> product.getPrice() > 4).mapToInt(Product::getQuantity).sum();

        System.out.println(total);
    }
}
