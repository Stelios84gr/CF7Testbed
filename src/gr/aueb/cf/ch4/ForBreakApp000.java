package gr.aueb.cf.ch4;

/**
 * Η break σταματάει την εκτέλεση.
 */
public class ForBreakApp000 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
            if (i == 5) {
                break;
            }
        }
            System.out.println();
            System.out.println("Ο βρόγχος for σταμάτησε.");
        }
    }
