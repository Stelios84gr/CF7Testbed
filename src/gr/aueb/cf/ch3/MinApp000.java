package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει τον μικρότερο
 * δύο ακεραίων.
 */
public class MinApp000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους:");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        System.out.printf("Η ελάχιστη τιμή μεταξύ %d και %d είναι: %d\n", num1, num2, min);
    }
}
