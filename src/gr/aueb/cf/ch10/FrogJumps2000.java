package gr.aueb.cf.ch10;

/**
 * More efficient version
 */
public class FrogJumps2000 {

    public static void main(String[] args) {
        int x = 10, y = 85, d = 20;

        System.out.println(getJumps(x, y, d));
    }

    public static int getJumps(int startPos, int endPos, int jmp) {
        return (int) Math.ceil((endPos - startPos) / (double) jmp);
    }
}
