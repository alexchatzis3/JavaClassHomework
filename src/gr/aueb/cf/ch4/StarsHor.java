package gr.aueb.cf.exercises.ch4;

import java.util.Scanner;

/**
 * Επιστρέφει ν οριζόντια stars. Τον αριθμό
 * τον δίνει ο χρήστης στο standard input.
 */
public class StarsHor {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        // Δήλωση και αρχικοποίηση μεταβλητών
        int n = 0;
        System.out.println("Please insert n(integer).");
        n = scanner.nextInt();

        //Εντολές και εκτύπωση αποτελέσματος
        for (int i=1; i<=n; i++) {
            System.out.print("*");
        }
    }
}
