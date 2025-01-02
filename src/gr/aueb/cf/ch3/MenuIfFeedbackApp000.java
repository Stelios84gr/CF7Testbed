package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού με πολλαπλά
 * if-then-else.
 */
public class MenuIfFeedbackApp000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω ή 5 για έξοδο:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Αναζήτηση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Ενημέρωση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Επιτυχής εισαγωγή.");
            } else if (choice == 2) {
                System.out.println("Επιτυχής αναζήτηση.");
            } else if (choice == 3) {
                System.out.println("Επιτυχής διαγραφή.");
            } else if (choice == 4) {
                System.out.println("Επιτυχής ενημέρωση.");
            } else if (choice == 5) {
                System.out.println("Επιλέξατε έξοδο.");
            } else {
                System.out.println("Λάθος επιλογή");
            }
        } while (choice != 5);

        System.out.println("Ευχαριστούμε!");
    }
}
