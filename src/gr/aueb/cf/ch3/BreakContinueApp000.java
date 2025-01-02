package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δείχνει τη χρήση των break και continue.
 */
public class BreakContinueApp000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε έναν αριθμό:");
            num = in.nextInt();

            // Αν ο αριθμός είναι 5, αγνόησέ τον
            // και προχώρα κατευθείαν στον επόμενο βρόγχο.
            if (num == 5) {
                continue;
            }
            sum += num;

            // Αν ο αριθμός είναι 10, τότε
            // σταμάτα αμέσως τον βρόγχο
            // και βγες από τη while.
            if (num == 10) {
                break;
            }
        }

        System.out.println("Sum: " + sum);
    }
}