package gr.aueb.cf.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {
        String s = "0Sqwer6ty";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*[A-Z])(?=.*?[0-9])^.{8,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {

            System.out.println(matcher.group());
        }
    }
}
