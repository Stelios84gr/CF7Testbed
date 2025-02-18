package gr.aueb.cf.ch14.challenges;

public class ValidationUtils {

    public static boolean strLengthValidation(String str) {
        if (str == null) return false;

        return !str.isEmpty() && str.length() <= 31;
    }

    public static boolean isWithinLimits(int num) {
        return (num >= 1) && (num <= 10);
    }
}
