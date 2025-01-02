package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το απόλυτο ενός ακεραίου
 * και το εμφανίζει άμεσα στην printf.
 */
public class TernaryPrint000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Παρακαλώ εισάγετε έναν αριθμό:");
        num = in.nextInt();

        System.out.printf("Το απόλυτο του %d είναι: %d", num, (num > 0) ? num : -num);
    }
}
