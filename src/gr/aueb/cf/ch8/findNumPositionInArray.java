package gr.aueb.cf.ch8;

public class findNumPositionInArray {

    /**
     * Returns the position in an array of a
     * num.
     *
     * @param arr   the input array
     * @param num   the input num
     * @return the position in the array, if the num
     * was found, -1 otherwise
     */
    public static int findNumPositionArray(int[] arr, int num) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
