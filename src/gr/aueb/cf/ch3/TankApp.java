package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει true / false από το stdio
 * για τις δύο δεξαμενές, αν είναι <1/4.
 * Επεξεργάζεται και ανάβει πορτοκαλί αν
 * η μία είναι <1/4 και κόκκινο αν και
 * οι δύο είναι <1/4.
 */
public class TankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Παρακαλώ δηλώστε αν η στάθμη των δεξαμενών είναι χαμηλή (true/false).");
        System.out.println("Χαμηλή στάθμη πρώτης δεξαμενής:");
        isEmptyTank1 = sc.nextBoolean();
        System.out.println("Χαμηλή στάθμη δεύτερης δεξαμενής:");
        isEmptyTank2 = sc.nextBoolean();

        isOrange = isEmptyTank1 ^isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.printf("Πορτοκαλί ένδειξη: %b, Κόκκινη ένδειξη: %b", isOrange, isRed);
    }
}
