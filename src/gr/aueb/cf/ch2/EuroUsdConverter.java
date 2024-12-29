package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει Ευρώ σε USD και cents.
 * Η ισοτιμία 99 cents = 1 ευρώ
 */

public class EuroUsdConverter {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση Μεταβλητών
        int inputEuros = 0;
        int totalUsaCents =0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        int dollars = (inputEuros * 99) / 100;
        int cents = (inputEuros * 99) % 100;

        // Εντολές
        System.out.println("Please insert an integer amount (Euro)");
        inputEuros = in.nextInt();
        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d \u20AC = %d \u0024, %d usa cents", inputEuros, usaDollars, usaCents); //Το "\ u" εισάγει σύμβολο σε χαρακτήρα UTF-8.
    }
}
