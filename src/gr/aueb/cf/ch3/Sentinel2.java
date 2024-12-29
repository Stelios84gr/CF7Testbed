package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel2 {
    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");

        while ((inputNum = in.nextInt()) >= 0) { // Η τιμή της παρένθεσης είναι η τιμή του αριστερού μέρους.
            positivesCount++;
            System.out.println("Please insert a num");
        }

        System.out.println("Positives count: " + positivesCount);
    }
}