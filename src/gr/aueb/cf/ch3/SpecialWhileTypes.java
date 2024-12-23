package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Special forms of while.
 */
public class SpecialWhileTypes {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        int num = 0;

        // while ((num = in.nextInt() >= 0));  Όσο υπάρχουν θετικοί τους καταναλώνει (τους αγνοεί).

        while (i <= 0) {
            System.out.println("Never gets in");
            i++;
        }

        while (i < 1) {
            System.out.println("Never gets in");
            i++;
        }

        while (i <= 1) {
            System.out.println("One time gets in");
            i++;

            while (true) {
                System.out.println("Eternal loop");
            }
        }
    }
}
