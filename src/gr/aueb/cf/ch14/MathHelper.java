package gr.aueb.cf.ch14;

/**
 * Μία utility class για κοινές μαθηματικές λειτουργίες
 * όπως εύρεση του μέγιστου, ελάχιστου και μέσου όρου
 * ενός array από integers.
 */
public class MathHelper {


    /**
     * Επιστρέφει το μέγιστο στοιχείου ενός array που
     * αποτελείται από ακεραίους αριθμούς.
     * @param numbers
     *      οι ακέραιοι αριθμοί του array.
     * @return
     *      το μέγιστο στοιχείο του array.
     */
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


    /**
     * Επιστρέφει το ελάχιστο στοιχείο ενός array που
     * αποτελείται από ακεραίους αριθμούς.
     * @param numbers
     *      οι ακέραιοι αριθμοί του array.
     * @return
     *      το ελάχιστο στοιχείο του array.
     */
    public static int findMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }


    /**
     * Επιστρέφει τον μέσο όρο ενός array που αποτελείται
     * από ακεραίους αριθμούς.
     * @param numbers
     *      οι ακέραιοι αριθμοί του array.
     * @return
     *      ο μέσος όρος του array.
     */
    public static double findAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0 ) {
            throw new IllegalArgumentException("Array is null or empty.");
        }

        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }


}
