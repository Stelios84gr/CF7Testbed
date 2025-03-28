package gr.aueb.cf.ch19.sets;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("Apple");
        bag.add("Orange");
        bag.add("Apple");   // no duplicates allowed

        if (bag.contains("Apple")) {
            bag.remove("Apple");
        }

        //Iterate
        bag.forEach(System.out::println);
    }
}
