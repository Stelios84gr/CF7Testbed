package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Δέχεται βαθμούς στην κλίμακα Φαρενάιτ και
 * μετατρέπει στην κλίμακα Κελσίου.
 */
public class FahrenheitToCelsius111 {

    public static void main(String[] args) {

        int F = 0;
        int C = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε θερμοκρασία σε βαθμό της κλίμακας Φαρενάιτ:");
        F = sc.nextInt();

        C = (5 * (F - 32)) / 9;

        System.out.println("Θερμοκρασία σε βαθμούς Φαρενάιτ: " + F);
        System.out.println("Θερμοκρασία σε βαθμούς Κελσίου: " + C);
    }
}
