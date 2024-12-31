package gr.aueb.cf.ch2;

/**
 * Type suffix demo.
 */
public class TypeSuffixApp000 {

    public static void main(String[] args) {
        /*
         * int literals are integers (32-bit)
         * by default. In order to typecast to
         * long we have to insert a type suffix L or l
         */
        long num1 = 2147483648L;

        /*
         * For short and byte data types
         * no type-suffixes are provided.
         */
        short num2 = 12;
        byte b1 = 2;
    }
}
