package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Βρίσκει τα ψηφία ενός διψήφιου αριθμού
 * και τα προσθέτει.
 */
public class IntDigits000 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sum = 0;

        System.out.println("Παρακαλώ εισάγετε διψήφιο αριθμό:");
        num = sc.nextInt();
        leftDigit = num / 10;
        rightDigit = num % 10;

        sum = leftDigit + rightDigit;

        System.out.printf("Αριστερό ψηφίο: %d, Δεξί ψηφίο: %d, Άθροισμα: %d", leftDigit, rightDigit, sum);
    }
}
