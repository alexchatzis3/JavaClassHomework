package gr.aueb.cf.exercises.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει αριθμό ν από το standard input και
 * το πρόγραμμα τα εμφανίζει σε αύξουσα σειρά.
 * 1η σειρα -> 1 αστεράκι
 * 2η σειρά -> 2 αστεράκια
 * κ.ο.κ.
 */
public class StarsAsc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Δήλωση και αρχικοποίηση μεταβλητών
        int n = 0;
        System.out.println("Please insert n (integer).");
        n = scanner.nextInt();

        //Εντολές και εκτύπωση αποτελέσματος
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
