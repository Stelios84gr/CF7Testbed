package gr.aueb.cf.ch19;

import java.util.List;

public class MainGen {

    public static void main(String[] args) {
        NodeGen<String> strNode = new NodeGen<>();
        NodeGen<Integer> intNode = new NodeGen<>();
        var doubleNode = new NodeGen<Double>();

        Integer[] intArr = {1, 2, 3, 4, 5, 6};
        String[] cities = {"Athens", "Paris", "London"};

        print(intArr);
        print(cities);

        intNode.setItem(1);
//        String s = (String) intNode.getItem();   // Ο compiler δεν επιτρέπει class cast exceptions
    }

    public static <T> void print(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    public static <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    public static void printGenericList(List<?> list, Object element) {
//        list.add(element);    // δεν μπορούμε να προσθέσουμε κάτι άλλο
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void printNode(NodeGen<? extends Number> nodeGen) {   // άνω όριο που σημαίνει is a number
        System.out.println(nodeGen.getItem());
    }

    public static <T extends Number> void printBound(List<T> list) {
        double sum = 0.0;

        for (T number : list) {
            sum += number.doubleValue();    // επιστρέφει double από ένα Number
        }
    }

    public static <T> void consumerProducer(List<? super T> consumer, List<? extends T> producer) {     // κάτω όριο - σημαίνει οτιδήποτε που είναι υπερκλάση του T
        for (T t : producer) {
            consumer.add(t);
        }
    }
}
