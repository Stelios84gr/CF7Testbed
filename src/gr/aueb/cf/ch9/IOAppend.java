package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Το πρόγραμμα αυτό επιδεικνύει πώς κάνουμε append (δηλ. γράφουμε στο τέλος)
 * σε ένα αρχείο. Παρατηρείστε την FileOutputStream, που παίρνει το όνομα του
 * αρχείου, αλλά και μία παράμετρο true που είναι το append.
 */
public class IOAppend {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/TestAppend1.txt", true));
             PrintWriter pw = new PrintWriter(new FileOutputStream("C:/tmp/TestAppend2.txt", true));) {

            ps.println("Hello from PrintStream");
            pw.println("Hello from PrintWriter");

            ps.close();
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
