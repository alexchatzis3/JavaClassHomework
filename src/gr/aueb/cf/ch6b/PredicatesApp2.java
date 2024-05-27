package gr.aueb.cf.exercises.ch6b;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έξι ακεραίους από 1 έως 49.
 * Η εφαρμογή ελέγχει εάν :
 * 1. Δεν έχει πάνω από 3 άρτιους
 * 2. Δεν έχει πάνω από 3 περιττούς
 * 3. Δεν έχει πάνω από 3 συνεχόμενους
 * 4. Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα.
 * 5. Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα.
 */
public class PredicatesApp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Δήλωση πίνακα και μεγέθους στοιχείων
        int[] arr = new int[6];

        //Αρχικοποίηση πίνακα με user input
        System.out.println("Παρακαλώ εισάγετε 6 ακεραίους για τον πίνακα.");
        for (int i = 0; i < 6; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            }
        }

        //Εκτύπωση αποτελεσμάτων
        //Ερώτηση 1.
        System.out.println("Ο πίνακας που μας έδωσε ο χρήστης δεν έχει περισσότερους από τρείς άρτιους αριθμούς: " +  hasNotMTThreeEven(arr, 3));
        //Ερώτηση 2.
        System.out.println("Ο πίνακας που μας έδωσε ο χρήστης δεν έχει περισσότερους από τρείς περιττούς αριθμούς: " + hasNotMTThreeOdd(arr, 3));
        //Ερώτηση 3.
        System.out.println("Ο πίνακας που μας έδωσε ο χρήστης δεν έχει περισσότερους από τρείς συνεχόμενους αριθμούς: " + hasNotMTThreeConsecutive(arr, 3));
        //Ερώτηση 4.
        System.out.println("Ο πίνακας που μας έδωσε ο χρήστης δεν έχει περισσότερους από τρείς αριθμούς με τον ίδιο λήγοντα: " + hasNotMTThreeWithSameEnding(arr, 3));
        //Ερώτηση 5.
        System.out.println("Ο πίνακας που μας έδωσε ο χρήστης δεν έχει περισσότερους απο τρείς αριθμούς που ανήκουν στην ίδια δεκάδα: " + hasNotMTThreeInSameGroupOfTen(arr, 3));
    }


    /**
     * Επιστρέφει true, εάν ο πίνακας που μας δίνει ο χρήστης
     * έχει λιγότερους ή ίσους από τρείς άρτιους αριθμούς και false
     * εάν έχει περισσότερους.
     *
     *
     * @param arr            ο πίνακας που μας δίνει ο χρήστης
     * @param threshold      το όριο των τριών άρτιων στοιχείων του πίνακα
     * @return               επιστρέφει true ή false, εάν δεν περάσαμαε αυτό
     *                       το όριο ή όχι.
     */
    public static boolean hasNotMTThreeEven(int[] arr, int threshold) {
        if (arr == null) return false;
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }

        return count <= threshold;
    }


    /**
     * Επιστρέφει true, εάν ο πίνακας που μας δίνει ο χρήστης
     * έχει λιγότερους ή ίσους από τρείς περιττούς αριθμούς και false
     * εάν έχει περισσότερους.
     *
     *
     * @param arr          ο πίνακας που μας δίνει ο χρήστης
     * @param threshold    το όριο των τριών άρτιων στοιχείων του πίνακα
     * @return             επιστρέφει true ή false, εάν δεν περάσαμε αυτό
     *                     το όριο ή όχι.
     */
    public static boolean hasNotMTThreeOdd(int[] arr, int threshold) {
        if (arr == null ) return false;
        int count = 0;

        for (int item: arr) {
            if (item % 2 != 0) {
                count++;
            }
        }

        return count <= threshold;
    }

    /**
     * Επιστρέφει true, εάν ο πίνακας που δίνει ο χρήστης έχει λιγότερους
     * ή ίσους με τρείς συνεχόμενους ακεραίους αριθμούς, και false εάν έχει
     * περισσότερους.
     *
     * @param arr           ο πίνακας που δίνει ο χρήστης.
     * @param threshold     το όριο των τριών συνεχόμενων ακεραίων.
     * @return              το αποτέλεσμα true ή false, εάν έχουμε λιγότερους
     *                      ή περισσότερους συνεχόμενους αριθμούς.
     */
    public static boolean hasNotMTThreeConsecutive(int[] arr, int threshold) {
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1] + 1) {
                count++;
            }
        }

        return count <= threshold;
    }


    /**
     * Επιστρέφει true εάν ο νέος πίνακας endings έχει λιγότερους ή ίσους με 3
     * αριθμούς, και false εάν έχει περισσότερους.
     *
     * @param arr           ο αρχικός πίνακας που δίνει ο χρήστης
     * @param threshold     το όριο των τριών ίδιων ληγόντων.
     * @return              επιστρέφει true, εάν έχουμε λιγότερους ή ίσους
     *                      με το όριο λήγοντες , και false εάν
     *                      έχουμε περισσότερους.
     */
    public static boolean hasNotMTThreeWithSameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];
        boolean sameEnding = true;

        for(int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item > threshold) {
                sameEnding = false;
                break;
            }
        }
        return sameEnding;
    }


    /**
     * Επιστρέφει true εάν ο πίνακας έχει λιγότερους ή ίσους με τρείς
     * ακέραιους αριθμούς που ανήκουν στην ίδια δεκάδα και false εάν είναι
     * περισσότεροι απο τρείς.
     *
     * @param arr           ο πίνακας που μας δίνει ο χρήστης.
     * @param threshold     το όριο των τριών αριθμών της ίδιας δεκάδας.
     * @return              επιστρέφει true ή false άναλογα με τους ακεραίους αριθμούς
     *                      που έχει δώσει ο χρήστης.
     *
     */
    public static boolean hasNotMTThreeInSameGroupOfTen(int[] arr, int threshold) {
        int[] tens = new int[10];
        boolean sameTen = true;

        for (int item : arr) {
            tens[item / 10]++;
        }

        for (int item : tens) {
            if (item > threshold) {
                sameTen = false;
                break;
            }
        }
        return sameTen;
    }






}
