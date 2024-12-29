package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * A small frog wants to go to the other side of the road.
 * The frog is currently located at position X and wants to
 * go to a position greater or equal to Y. The small frog jumps
 * a fixed distance, D. Find the minimum number of jumps.
 * For distance
 */
public class FrogJumps {
    public static void main(String[] args) {
        int start = 10;
        int target = 85;
        int hop = 30;
        int jumps = 0;

        // calculate jumps
        jumps = (int) Math.ceil((target - start) / (double) hop); // Πρώτα κάνουμε το hop double, όπως θέλει η ceil, καθώς αρκεί να μετατρέψουμε μόνο έναν όρο σε double, και μετά κάνουμε πάλι όλο το jumps int.

        System.out.println("Jumps: " + jumps);
    }
}