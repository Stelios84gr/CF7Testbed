package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class getFileDescriptor000 {

    public static void main(String[] args) {

    }

    public static Scanner getFileDescriptor(String s) throws FileNotFoundException {
        File fd = new File(s);
        try {
            return new Scanner(fd);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
