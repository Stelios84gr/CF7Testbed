package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * 153 => 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int numberOfDigits = 0;
        int originalNum = 0;
        int digit;

        System.out.println("Please enter a number (integer)");
        num = scanner.nextInt(); // valueOF transforms a primitive to String
        originalNum = num;
        while (num != 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;          // num = num / 10;
        }

        System.out.printf("%d%s Armstrong", originalNum, (sum == originalNum ? " is " : " is not "));
    }
}
