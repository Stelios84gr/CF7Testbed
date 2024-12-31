package gr.aueb.cf.ch2;

/**
 * Προσθέτει δύο ακεραίους ενώ το αποτέλεσμα
 * δημιουργεί overflow (υπερχείλιση)
 */
public class AddApp000 {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
