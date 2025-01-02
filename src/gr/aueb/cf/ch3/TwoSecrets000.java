package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δέχεται έναν αριθμό από τον χρήστη και ελέγχει
 * αν είναι ένας από τους 2 μυστικούς αριθμούς.
 * Επιστρέφει τα αντίστοιχα μηνύματα.
 */
public class TwoSecrets000 {

    public static void main(String[] args) {
        final int SECRET_1 = 10;
        final int SECRET_2 = 20;
        int inputNum;
        Scanner in = new Scanner(System.in);
        boolean found = false;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε έναν αριθμό:");
            inputNum = in.nextInt();

            if (inputNum == SECRET_1 || inputNum == SECRET_2) {
                found = true;
            }

            if (!found) {
                System.out.println("Προσπαθήστε ξανά.");
                continue;
            }

            System.out.println("Συγχαρητήρια!");
            break;
        }
    }
}
