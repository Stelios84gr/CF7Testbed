package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη έναν ακέραιο,
 * ένα σύμβολο πράξης και έναν ακόμα ακέραιο και
 * στη συνέχεια εκτελεί την πράξη ανάλογα με το
 * σύμβολο που έχει δοθεί: +, -, *, /, %.
 */
public class CalculatorApp000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        int choice = 0;
        char operator = ' ';
        boolean isError = false;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο, έναν τελεστή και έναν ακόμα ακέραιο:");
        num1 = in.nextInt();
        operator = in.next().charAt(0);
        num2 = in.nextInt();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 - num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                }
                break;
            default:
                System.out.println("Σφάλμα στον τελεστή");
                isError = true;
                break;
        }
        if (!isError) {
            System.out.printf("%d %c %d = %d", num1, operator, num2, result);
        }
    }
}
