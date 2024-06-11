package gr.aueb.cf.ch14;

/**
 * Ένα utility class με μεθόδους για data validation, όπως
 * έλεγχος αν ένα string έχει μήκος 1-31 chars και αν
 * ένας αριθμός είναι ανάμεσα σε 1 και 10.
 */
public class ValidationUtils {

    /**
     * Ελέγχει εάν το δοθέν string έχει μήκος ανάμεσα σε
     * 1 και 31 χαρακτήρες.
     * @param str
     *      το string προς έλεγχο.
     * @return
     *      true αν το μήκος του string είναι ανάμεσα σε
     *      1 και 31.
     */
    public static boolean isValidLength(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        return length >= 1 && length <= 31;
    }


    /**
     * Ελέγχει εάν ο δοθείς αριθμός είναι ανάμεσα σε
     * 1 και 10.
     * @param number
     *      ο αριθμός προς έλεγχο.
     * @return
     *      true εάν ο αριθμός είναι ανάμεσα σε 1 και 10
     *      αλλιώς false.
     */
    public static boolean isNumberInRange(int number) {
        return number >= 1 && number <= 10;
    }

}
