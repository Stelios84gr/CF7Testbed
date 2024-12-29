package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 * Calculates a^n. E.g., 2^10 = 1024.
 */
public class PowerApp {
    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1"); // για αριθμούς πολύ μεγάλους για να χωρέσουν σε int
        int base = 2;
        int power = 10;
        int result = 1;

        // for to calculate base ^ power

        for (int i = 1; i <= power; i++) {
            result = result * base; // result *= base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base)); // Επειδή οι αριθμητικοί τελεστές δεν μπορούν να χρησιμοποιηθούν με BigIntegers, χρησιμοποιούμε τη μέθοδο .multiply αντ' αυτού. Επειδή το result είναι int, πρέπει να γίνει typecast σε BigInteger.
        }

        System.out.println("Result: " + result);
        System.out.println("Result: " + bigResult);
    }
}
