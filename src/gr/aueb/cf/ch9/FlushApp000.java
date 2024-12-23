package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FlushApp000 {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:/tmp/flush-file.txt");
            Scanner in = new Scanner(System.in)) {
            pw.print("Hello");
            pw.flush();
            System.out.println("Insert something to continue");
            in.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
