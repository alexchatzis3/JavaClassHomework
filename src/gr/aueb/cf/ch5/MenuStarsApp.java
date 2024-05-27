package gr.aueb.cf.exercises.ch5;

import java.util.Scanner;

/**
 * Δημιουργούμε μενού με 6 επιλογές σχετικά με το πως
 * θα εμφανιστούν τα αστεράκια, ο χρήστης επιλέγει
 * και οι πρωτες 5 επιλογές υλοποιούνται με μέθοδο.
 * Το πρόγραμμα τρέχει μέχρι ο χρήστης να επιλέξει
 * την επιλογή 6.
 */
public class MenuStarsApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    //Αρχικοποίηση και δήλωση μεταβλητών
        int choice = 0;
        int n = 0;
        int result = 0;
    //Εντολές και εκτύπωση αποτελέσματος
        do {
            printMenu();
            System.out.println("Παρακαλώ εισάγετε επιλογή.");
            choice = getUserChoice();


            if (choice < 1 || choice > 6) {
                System.out.println("Λάθος επιλογή.");
                continue;
            }

            System.out.println("Παρακαλώ εισάγετε ακέραιο n.");
            n = getNumberChoice();
            result = getResult(choice, n);

        } while (choice != 6);
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή.");
    }

   //Μέθοδος για εμφάνιση μενού επιλογών
    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια.");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα.");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια.");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1");
        System.out.println("6. Έξοδος από το πρόγραμμα.");
    }
    //Μέθοδος για επιλογή χρήστη από το μενού επιλογών
    public static int getUserChoice() {
        return scanner.nextInt();
    }

    //Μέθοδος για επιλογή n από τον χρήστη
    public static int getNumberChoice() {
        return scanner.nextInt();
    }

    /**
     *
     * @param n is the number of stars that the user chose to view horizontally
     */
    public static void starsHor(int n) {

        for (int i=1; i<=n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     *
     * @param n is the number of stars that the user chose to view vertically
     */
    public static void starsVer(int n) {

        for (int i=1; i<=n; i++) {
            System.out.println("*");
        }
    }

    /**
     *
     * @param n is the number of stars, n times shown
     */
    public static void linesStars(int n) {

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print("*");
                if (j % n == 0) {
                    System.out.println();
                }
            }
        }
    }

    /**
     *
     * @param n is the number of stars we will ascend to, starting from 1 star
     */
    public static void starsAsc(int n) {

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *
     * @param n is the number we will start to descend from, until we reach 1 star
     */
    public static void starsDesc(int n) {

        for (int i=1; i<=n; i++) {
            for (int j=n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *
     * @param choice the choice the user made from the menu
     * @param n the number the user chose for the stars
     * @return
     */
    public static int getResult(int choice, int n) {
        int result = 0;

        switch (choice) {
            case 1:
                starsHor(n);
                break;
            case 2:
                starsVer(n);
                break;
            case 3:
                linesStars(n);
                break;
            case 4:
                starsAsc(n);
                break;
            case 5:
                starsDesc(n);
                break;
            case 6:
                System.out.println("Επιλέξατε έξοδο.");
                break;
            default:
                System.out.println("Λάθος επιλογή");
        }
        return result;
    }

}