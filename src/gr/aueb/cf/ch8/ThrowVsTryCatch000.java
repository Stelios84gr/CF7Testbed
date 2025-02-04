package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Checked exceptions could be addressed
 * using try/catch
 */
public class ThrowVsTryCatch000 {

//    public static void main(String[] args) {
//        try {
//            char ch = (char) System.in.read();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

    public static void main(String[] args) throws IOException {
        char ch = (char) System.in.read();
    }
}