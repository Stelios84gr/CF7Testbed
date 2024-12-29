package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMethod {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:/tmp/cf7.txt");
        printMsg(ps, "Hello Coding Factory");
        printMsg(System.out, "Coding Factory");
    }

    /**
     * Prints a string message to PrintStream.
     *
     * @param ps        the PrintStream object
     * @param message   the message to print
     */
    public static void printMsg(PrintStream ps, String message) {
        ps.println(message);
    }
}
