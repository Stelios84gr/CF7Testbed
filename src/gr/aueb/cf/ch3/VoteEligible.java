package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες > 28.
 * Ελέγχει αν μία ηλικία έχει δικαίωμα
 * να ψηφίσει.
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        final int VOTING_AGE = 18;
        boolean isEligible = false;

        System.out.println("Enter your age");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible: " + isEligible);
    }
}