package gr.aueb.cf.exercises.ch6;

/**
 * Returns the position of the array containing the
 * highest element value.
 */
public class GetMaxPosition {

    public static void main(String[] args) {
        //δήλωση και αρχικοποίηση πίνακα arr και μεταβλητής maxPosition
        int[] arr = {2, 4, 8, 12, 7, 5, 18};
        int maxPosition = 0;

        //Εντολές
        maxPosition = getMaxPosition(arr, 0, arr.length - 1);

        //Εκτύπωση αποτελέσματος, κάνουμε διόρθωση στο maxPosition(+1) για να είναι user-friendly.
        System.out.printf("Max Value: %d, Max Position: %d", arr[maxPosition], maxPosition + 1);
    }

    /**
     * Returns the position of the max value in a source array.
     * @param arr       the source array
     * @param low       starting position in the array
     * @param high      ending position in the array
     * @return          the position of the array containing
     *                  the highest element value.
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = high;
        int maxValue;

        if ((low < 0 ) || (high > arr.length - 1)) {
            System.out.println("Error in array dimensions");
            return -1; //Returns an invalid position
        }

        maxValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;

    }



}

