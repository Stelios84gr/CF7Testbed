package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει το τετράγωνο και τον κύβο ενός αριθμού
 * που δίνει ο χρήστης. Χρησιμοποιεί την έτοιμη μέθοδο
 * Math.pow() της κλάσης Math.
 */
public class MathPowers000 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Παρακαλώ δώστε έναν αριθμό");
        num = sc.nextInt();

        System.out.printf("Τετράγωνο: %d, Κύβος: %d", (int) Math.pow(num, 2), (int) Math.pow(num, 3));
    }
}
