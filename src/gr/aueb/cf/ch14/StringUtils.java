package gr.aueb.cf.ch14;

/**
 * Μία utility class με μεθόδους για string manipulation
 * όπως να γίνεται reverse ένα string, να μετατρέπεται
 * ένα string σε uppercase και να ελέγχεται εάν ένα
 * string είναι παλινδρομικό.
 */
public class StringUtils {

    /**
     * Αναστρέφει το δοθέν string.
     * @param str
     *      το string προς αναστροφή.
     * @return
     *      το αναστραμμένο string.
     */
    public static String toReverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }


    /**
     * Μετατρέπει το δοθέν string σε uppercase.
     * @param str
     *      το string προς μετατροπή σε uppercase.
     * @return
     *      to string σε uppercase.
     */
    public static String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    /**
     * Ελέγχει εάν το δοθέν string είναι παλινδρομικό.
     * @param str
     *      το string προς έλεγχο.
     * @return
     *      true εάν το string είναι παλινδρομικό, αλλιώς false.
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String reversed = toReverse(str);
        return str.equals(reversed);
    }

}
