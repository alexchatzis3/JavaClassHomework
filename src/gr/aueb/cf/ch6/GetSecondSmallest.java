package gr.aueb.cf.exercises.ch6;

/**
 * Επιστρέφει το στοιχείο ενός πίνακα που είναι
 * το αμέσως μεγαλύτερο από το μικρότερο στοιχείο.
 */
public class GetSecondSmallest {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση πίνακα και μεταβλητής
        int[] arr = {6, 36, 24, 9, 2, 64};
        int n = arr.length;
        //Εκτύπωση αποτελέσματος
        System.out.println("The second smallest value is: " + secSmallest(arr,n));

    }

    /**
     * Returns the second-smallest value in the array
     * @param arr   the name of the array where the values are in
     * @param n     the length of the array
     * @return      the value of the second-smallest integer
     */
    public static int secSmallest(int[] arr, int n) {

        int smallest = arr[0];


        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

        }

        int sec_smallest = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            if (arr[j] != smallest && arr[j] < sec_smallest) {
                sec_smallest = arr[j];
            }
        }

        return sec_smallest;
    }
}
