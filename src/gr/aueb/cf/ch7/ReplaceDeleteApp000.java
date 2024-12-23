package gr.aueb.cf.ch7;

public class ReplaceDeleteApp000 {

    public static void main(String[] args) {
        String firstname = "Maria-Helen";
        String simpleName;
        String nickname;
        String oneName;
        String newName;

        //Replaces dash with whitespace.
        simpleName = firstname.replace("-", " ");

        // Replaces with empty string (string with length() == 0),
        // Thus, essentially deletes.
        nickname = firstname.replace("-","");

        // Replaces with empty string. - Deletes
        oneName = firstname.replace("-Helen", "");

        // Replaces every occurrence with replacement string.
        newName = firstname.replaceAll("e", "a");

        System.out.println(newName);
    }
}
