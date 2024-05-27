package gr.aueb.cf.exercises.ch2;

import java.util.Scanner;

/**
 * Πρόγραμμα που διαβάζει 3 ακέραιους αριθμούς από τον
 * χρήστη και επιστρέφει ημερομηνία σε μορφή
 * ΗΗ/ΜΜ/ΕΕ
 */
public class DateApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int date_year = 0;

        //Εντολές
        System.out.println("Please enter day, month and year.");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        date_year = year % 100;

        //Εκτύπωση Αποτελέσματος
        System.out.printf("The date is %02d/%02d/%02d", day, month, date_year);
    }
}
