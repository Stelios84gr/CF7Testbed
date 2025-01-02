package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Δέχεται 3 ακέραιους αριθμούς που αναπαριστούν
 * ημέρα, μήνα και έτος αντίστοιχα και εμφανίζει
 * την ημερομηνία με μορφή ΗΗ/ΜΜ/ΕΕ.
 */
public class DateApp111 {

    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int year = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε 3 αριθμούς:");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        System.out.printf("Ημερομηνία: %02d/%02d/%02d", day, month, year % 100);
    }

}
