package gr.aueb.cf.ch19.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Athens");
        cities.add("NY");
        cities.add("London");

        String c = cities.get(0);

        int nyPosition = cities.indexOf("NY");
        if (nyPosition != -1) {
            cities.set(nyPosition, "New York");
        } else {
            System.out.println("NY does not exist");
        }

        if (cities.contains("Athens")) {
            cities.remove("Athens");
        } else {
            System.out.println("Athens does not exist");
        }

        cities.removeIf(city -> c.startsWith("A"));

        // Iterate - 4 ways
        // 1. for
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        // 2. enhanced for
        for (String city : cities) {
            System.out.println(city);
        }

        // 3. Iterator
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 4. forEach with lamda method or method reference
        cities.forEach(System.out::println);

        Iterator<String> iter = cities.iterator();
        while (iter.hasNext()) {
            String city = iter.next();
            if (city.equals("NY")) {
                iter.remove();
//              cities.remove(city);        // exception
            }
        }
    }
}
