package gr.aueb.cf.exercises.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει ν οριζόντια αστεράκια. Τον αριθμό ν
 * τον δίνει ο χρήστης στο standard input.
 */
public class StarsVert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Δήλωση και αρχικοποίηση μεταβλητών
        int n = 0;
        System.out.println("Please insert n(integer)");
        n = scanner.nextInt();

        //Εντολές και εκτύπωση αποτελέσματος
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

    }
}
