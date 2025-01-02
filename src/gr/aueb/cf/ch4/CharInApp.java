package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Reads a char as a byte.
 */
public class CharInApp {

    public static void main(String[] args) throws IOException {
     char ch = ' ';
     Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character");
        // ch = (char) System.in.read(); // Επειδή μπορεί να διακοπεί η σύνδεση ή να μην υπάρχει το αρχείο απ' όπου διαβάζει, μπορεί να βγάλει exception και αυτό πρέπει να το δηλώσουμε στη main.

        ch = scanner.nextLine().charAt(0); //Διαβάζει ό,τι γράφει ο χρήστης μέχρι ν' αλλάξει γραμμή και φέρνει μόνο τον χαρακτήρα στην πρώτη θέση (0).

        System.out.printf("%c", ch);
    }
}
