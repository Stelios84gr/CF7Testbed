package gr.aueb.cf.ch14.challenges;

public class MathHelper {

    private MathHelper() {

    }

    public static int getMin(int[] arr) {

        if (arr == null || arr.length < 1) return Integer.MAX_VALUE;

        int minVal = arr[0];

        for (int i : arr) {
            if (i < minVal) {
                minVal = i;
            }
        }
        return minVal;
    }

    public static int getMax(int[] arr) {

        if (arr == null || arr.length < 1) return Integer.MAX_VALUE;

        int maxVal = arr[0];

        for (int i : arr) {
            if (i > maxVal) {
                maxVal = i;
            }
        }
        return maxVal;
    }

    public static double getAvg(int[] arr) {

        if (arr == null || arr.length == 0) return Double.NaN;

        int sum = 0;

        for (int i : arr) {
            sum+= i;
        }
        return (double) sum / arr.length;
    }
}
