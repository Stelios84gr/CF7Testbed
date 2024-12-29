package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Prints text with PrintWriter
 */
public class PrintWriterApp {

    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter("C:/tmp/cf7.txt");) {
            pw.println("Hello World!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
