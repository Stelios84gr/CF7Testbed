package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Prints with PrintStream class
 */
public class PrintStreamApp000 {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/f7.txt")) {
            ps.println("Hello Coding Factory");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}