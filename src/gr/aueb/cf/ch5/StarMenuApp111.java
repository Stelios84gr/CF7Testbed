package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού με 6 επιλογές. Ο χρήστης
 * καλείται να δώσει επιλογή, βάσει της οποίας
 * εκτελείται η αντίστοιχη λειτουργία.
 */
public class StarMenuApp111 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int input = 0;

        do {
            printMenu();
            input = getChoice();
            if (input < 1 || input > 6) {
                System.out.println("Σφάλμα. Ο αριθμός πρέπει να είναι μεταξύ 1 και 6.");
                System.out.println("Προσπαθήστε ξανά.");
                continue;
            }

            switch (input) {
                case 1:
                    choice1();
                    break;
                case 2:
                    choice2();
                    break;
                case 3:
                    choice3();
                    break;
                case 4:
                    choice4();
                    break;
                case 5:
                    choice5();
                case 6:
                    System.out.println("Έξοδος.");
                    break;
                default:
                    System.out.println("Σφάλμα επιλογής");
                    break;
            }
        } while (input != 6);
    }

    public static void printMenu() {
        System.out.println("Παρακαλώ εισάγετε έναν αριθμό από το 1 έως το 6:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static int getChoice() {
        return sc.nextInt();
    }

    public static int getStarsCount() {
        System.out.println("Παρακαλώ εισάγετε αριθμό αστερακίων:");
        return sc.nextInt();
    }

    public static void choice1() {
        int i = 0;
        int n = getStarsCount();

        for (i = 0; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void choice2() {
        int i = 0;
        int n = getStarsCount();

        for (i = 1; i <=n; i++) {
            System.out.println("*");
        }
    }

    public static void choice3() {
        int i = 0;
        int j = 0;
        int n = getStarsCount();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    public static void choice4() {
        int i = 0;
        int j = 0;
        int n = getStarsCount();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void choice5() {
        int i = 0;
        int j = 0;
        int n = getStarsCount();

        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j-- ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
