package gr.aueb.cf.ch3;

/**
 * Calculate the sum and mul of
 * the first 10 integers.
 */
public class SumMul {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int j = 1;
        int mul = 1; // Το ουδέτερο στοιχείο στον πολ/σμό είναι το 1, όχι το 0.

        while (i <= 10) {
            sum += i; //sum = sum + i;
            i++;
        }

        while (j <= 10) {
            mul *= j;
            j++;
        }
    }
}
