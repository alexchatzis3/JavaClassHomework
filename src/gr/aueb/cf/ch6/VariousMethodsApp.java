package gr.aueb.cf.exercises.ch6;

/**
 * Μέθοδοι που κάνουν τα παρακάτω:
 * 1.επιστρέφει τη θέση ενός στοιχείου του πίνακα
 * 2.εκτυπώνει μόνο τους ζυγούς αριθμούς(επιστρέφει void)
 * 3.επιστρέφει πίνακα με το διπλάσιο των αρχικών στοιχείων
 * 4.ελέγχει εάν υπάρχει έστω ένας θετικός αριθμός(επιστρέφει boolean)
 * 5.ελέγχει εάν όλα τα στοιχεία του πίνακα είναι θετικοί (επιστρέφει boolean)
 */
public class VariousMethodsApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        int[] arr = {3, 25, 36, -14, 47, 8};
        int position;


        //Εντολές
        position = getElementPosition(arr, 36);
        int[] mappedArray = mapDouble(arr);

        //Εκτύπωση αποτελεσμάτων
        //απάντηση στο 1ο ερώτημα
        System.out.printf("Position: %d, Value: %d\n", position + 1, arr[position]); //Προσθέτουμε ένα στη θέση ώστε να είναι user friendly.
        //απάντηση στο 2ο ερώτημα
        getEven(arr);
        //απάντηση στο 3ο ερώτημα
        traverse(mappedArray);
        //απάντηση στο 4ο ερώτημα
        System.out.println("Is there at least one positive number in array? " + isOnePositive(arr));
        //απάντηση στο 5ο ερώτημα
        System.out.println("Are all positive numbers in the array? " + areAllPositive(arr));
    }




    /**
     * Επιστρέφει τη θέση του στοιχείου του πίνακα που ισούται με το value
     * @param arr       ο πίνακας και τα στοιχεία του
     * @param value     το στοιχείο του πίνακα που ψάχνουμε να βρούμε τη θέση του
     * @return          η θέση του στοιχείου value στον πίνακα arr.
     */
    public static int getElementPosition(int[] arr, int value) {
        if (arr == null) return -1; //Επιστρέφει έναν μη έγκυρο αριθμό

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        //Εάν δε βρεθεί η value
        return -1;
    }


    /**
     * Εκτυπώνει τους ζυγούς αριθμούς του πίνακα έπειτα απο έλεγχο.
     * @param arr   ο πίνακας arr.
     */
    public static void getEven(int[] arr) {
        System.out.println("Even numbers in arr:");
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }


    /**
     * Επιστρέφει το διπλάσιο κάθε στοιχείου του αρχικού πίνακα σε έναν
     * νέο πίνακα.
     *
     * @param arr   ο αρχικός πίνακας.
     * @return      ο νέος πίνακας με τις διπλάσιες τιμές.
     */
    public static int[] mapDouble(int[] arr) {
        int[] arrayToReturn = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = arr[i] * 2;
        }
        return arrayToReturn;
    }

    /**
     * Εμφανίζει στον χρήστη τα διπλασιασμένα στοιχεία του νέου πίνακα.
     * @param arr   ο νέος πίνακας με τα διπλασιασμένα στοιχεία.
     */
    public static void traverse(int[] arr) {
        System.out.println("New array with double figures :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    /**
     * Επίστρεφει boolean εάν υπάρχει έστω ένας θετικός αριθμός στον πίνακα.
     * @param arr   ο πίνακας με τα στοιχεία του
     * @return      επιστρέφει το αποτέλεσμα έαν έχουμε ή όχι έστω έναν θετικό αριθμό.
     */
    public static boolean isOnePositive(int[] arr) {
        boolean isOnePositive = false;
        for (int j : arr) {
            if (j > 0) {
                isOnePositive = true;
                break;
            }
        }
        return isOnePositive;
    }


    /**
     * Επιστρέφει boolean εάν όλοι οι αριθμοί του πίνακα είναι θετικοί.
     * Θα συγκρίνουμε το counter των θετικών αριθμών με το πλήθος των αριθμών του
     * πίνακα για να δούμε εάν είναι ολοι θετικοί.
     * @param arr       ο πίνακας με τα στοιχεία του
     * @return          επιστρέφει το αποτέλεσμα εάν είναι όλα τα στοιχεία θετικοί αριθμοί ή οχι.
     */
    public static boolean areAllPositive(int[] arr) {
        int counter = 0;
        for (int j : arr) {
            if (j > 0) {
                counter++;
            }
        }

        return counter == arr.length;
    }




}
