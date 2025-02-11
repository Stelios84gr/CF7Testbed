package gr.aueb.cf.ch20.challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRegEx {

    public static void main(String[] args) {

        String s = "aueb-CF7";
        System.out.println(isPasswordValid(s));

    }

    Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#!?@$%^&*\\-]).{8,}$");

    private static boolean isPasswordValid(String s) {
        return s.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#!?@$%^&*\\-]).{8,}$");
    }
}
