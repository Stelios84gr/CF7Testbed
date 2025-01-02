package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν ο αριθμός που έδωσε ο χρήστης
 * είναι ο αριθμός - κλειδί. Αν είναι, κερδίζει,
 * ειδάλλως καλείται να δοκιμάσει ξανά.
 */
public class BingoApp000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int KEY = 10;
        int inputNum = 0;

        System.out.println("Παρακαλώ μαντέψτε τον αριθμό - κλειδί:");

        while (true) {
            inputNum = in.nextInt();

//            if (inputNum == KEY) {
//                System.out.println("Bingo!");
//                break;
//            } else {
//                System.out.println("Try Again");
//                continue;
//            }

            if (inputNum != KEY) {
                System.out.println("Προσπαθήστε ξανά.");
                continue;
            }

            System.out.println("Συγχαρητήρια!");
            break;
        }
    }
}
