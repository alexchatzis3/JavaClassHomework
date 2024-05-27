package gr.aueb.cf.exercises.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης μας δίνει ένα έτος από το standard input, το πρόγραμμα
 * το επεξεργάζεται και μας εμφανίζει στην οθόνη εάν είναι δίσεκτο
 * ή οχι.
 */
public class LeapYearApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        final int FACTOR_1 = 4;
        final int FACTOR_2 = 100;
        final int FACTOR_3 = 400;

        //Εντολές και εκτύπωση αποτελέσματος
        System.out.println("Please enter year(integer).");
        year = scanner.nextInt();

        if ((year % FACTOR_1 == 0)) {
            if (year % FACTOR_2 == 0) {
                if (year % FACTOR_3 != 0) {
                    System.out.println("This is not a leap year!");
                    System.exit(1);
                } else {
                    System.out.println("This is a leap year!");
                }
            } else {
                System.out.println("This is a leap year!");
            }
        } else {
            System.out.println("This is not a leap year!");
            System.exit(1);
        }
    }
}