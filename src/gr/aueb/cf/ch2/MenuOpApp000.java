package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Εκτελεί απλές αριθμητικές πράξεις σε δύο ακεραίους.
 */
public class MenuOpApp000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Παρακαλώ εισάγετε δύο ακέραιους:");
        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.printf("Άθροισμα: %d\n", num1 + num2);
        System.out.printf("Υπόλοιπο: %d\n", num1 - num2);
        System.out.printf("Γινόμενο: %d\n", num1 * num2);
        System.out.printf("Πηλίκο: %d\n", num1 / num2);
        System.out.printf("Υπόλοιπο: %d\n", num1 % num2);
    }
}
