package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Δέχεται έναν ακέραιο αριθμό και επιστρέφει
 * το τετράγωνό του.
 */
public class SquareApp111 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int input = 0;
        int result = 0;
        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο:");
        input = getNumber();
        result = getSquare(input);
        System.out.printf("Αριθμός: %d\nΤετράγωνο: %d", input, result);

        sc.close();
    }

    public static int getNumber() {
        while (!sc.hasNextInt()) {
            System.out.println("Παρακαλώ εισάγετε έναν έγκυρο ακέραιο:");
            sc.next();
        }
        return sc.nextInt();
    }

    public static int getSquare(int input) {
        return input * input;
    }
}