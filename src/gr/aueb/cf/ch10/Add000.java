package gr.aueb.cf.ch10;

import java.util.Scanner;

public class Add000 {
    static Scanner in = new Scanner(System.in);

    /**
     * Interacts with the user.
     */
    public static void main(String[] args) {
        int sum = 0;
        int num1;
        int num2;
        String token;

        System.out.println("Play the game");

        while (true) {
            try {
                num1 = getOneNum();
                num2 = getOneNum();

                sum = add(num1, num2);
                System.out.println("Sum: " + sum);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    /**
     * Returns true if the input string is an integer.
     * @param s the input string.
     * @return true, if the input string is integer, false otherwise.
     */
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Calculates and returns the sum of two integers.
     * @param a the first int
     * @param b the second int
     * @return the sum of the input integers
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Reads and returns an integer.
     *
     * @return      an int
     */
    public static int getOneNum() throws Exception {
        String numStr;
        int num;

        System.out.println("Please enter an int or # to exit");
        numStr = in.nextLine();
        if (numStr.equals("#")) {
            throw new Exception("Exit");
        }
        while (!isInt(numStr)) {
            System.out.println("Error. Please enter a valid integer");
            numStr = in.nextLine();
            if (numStr.equals("#")) {
                throw new Exception("Exit");
            }
        }
        num = Integer.parseInt(numStr);
        return num;
    }
}
