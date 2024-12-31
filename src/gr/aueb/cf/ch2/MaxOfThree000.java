package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Βρίσκει τον μέγιστο τριών ακεραίων
 * που δίνει ο χρήστης.
 */
public class MaxOfThree000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Παρακαλώ εισάγετε τρεις αριθμούς για να βρεθεί ο μέγιστος:");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.printf("Μέγιστος αριθμός μεταξύ %d, %d και %d είναι ο %d", num1, num2, num3, Math.max(num1, Math.max(num2, num3)));
    }
}
