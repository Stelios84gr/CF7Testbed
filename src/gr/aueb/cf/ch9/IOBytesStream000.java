package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Το πρόγραμμα αυτό αντιγράφει ένα αρχείο εικόνας
 * και ταυτόχρονα υπολογίζει το μέγεθος του αρχείου
 * που αντέγραψε.
 */
public class IOBytesStream000 {

    public static void main(String[] args) {

        try (FileInputStream in = new FileInputStream("C:/tmp/image.jpg");
             FileOutputStream out = new FileOutputStream("C:/tmp/imageCopy.jpg");)
             {
                 int b, count=0;
                 while ((b = in.read()) != -1) {
                     out.write(b);
                     count++;
             }
                 System.out.printf("Το αρχείο με μέγεθος %d Kbytes (%d bytes) αντιγράφηκε", count/1024, count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
