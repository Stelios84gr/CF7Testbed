package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Input mismatch exception when user inserts
 * a non-numeric string instead of integer.
 */
public class InputMismatchExceptionApp000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        try {
            System.out.println("Please insert an int");
            inputNum = in.nextInt();
            System.out.println("Input number: " + inputNum);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
