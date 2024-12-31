package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη ένα ακέραιο που αντιστοιχεί στο
 * πλήθος δευτερολέπτων και μετατρέπει σε ημέρες, ώρες, λεπτά
 * και δευτερόλεπτα και εκτυπώνει το αποτέλεσμα στην οθόνη.
 */
public class SecondsDemo000 {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        final int DAY = 24 * 3600;
        final int HOUR = 3600;
        final int MINUTE = 60;
        int inputSeconds = 0;
        int days = 0, hours = 0, minutes = 0;
        int remainingSeconds = 0;

        // Εντολές
        System.out.println("Please insert the count of seconds");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY;
        remainingSeconds %= DAY;

        hours = remainingSeconds / HOUR;
        remainingSeconds%= HOUR;

        minutes = remainingSeconds / MINUTE;
        remainingSeconds%= MINUTE;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Input seconds: %d = %d Days, %d Hours, %d Minutes, %d Seconds", inputSeconds, days, hours, minutes, remainingSeconds);
    }
}
