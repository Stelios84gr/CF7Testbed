package gr.aueb.cf.ch14.challenges;

public class StringUtils {

    public static String reverseStr(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static String toUpperCase(String str) {
        if (str == null) return null;

        return str.toUpperCase();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        String cleaned = str.replaceAll("\\s", "").toLowerCase();

        return new StringBuilder(cleaned).reverse().toString().equals(cleaned);
    }

}
