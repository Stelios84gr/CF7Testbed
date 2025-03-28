package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει όλα τα emojis στο εύρος 0x1F600 - 0x1F64F.
 * Η Character.toChars(UnicodeCodePoint), αν το UnicodeCodePoint
 * ανήκει στο Plane 0 (δηλαδή U+000 - U+FFF), επιστρέφει το ίδιο
 * το code point, αλλιώς, αν το UnicodeCodePoint είναι supplementary
 * code point (ανήκει σε μεγαλύτερο Plane (1-16) και έχει επομένως
 * 5 hex numbers, π.χ. 01xF600), επιστρέφει το surrogate pair.
 * Στο σύστημα Unicode τα Planes είναι συνεχόμενα groups από 65536 (2^16)
 * χαρακτήρες.
 */
public class EmojiPrint000 {

    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;
        int emoji;

        emoji = emojiStart;
        while (emoji < emojiEnd) {
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0) {
                System.out.println();
            }
        }
    }
}
