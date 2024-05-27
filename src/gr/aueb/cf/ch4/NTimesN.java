package gr.aueb.cf.exercises.ch4;

import java.util.Scanner;

/**
 * Επιστρέφει ν φορές ν stars. Τον αριθμό ν τον δίνει ο χρήστης
 * μέσω του standard input.
 */
public class NTimesN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Δήλωση και αρχικοποίηση μεταβλητών
        int n = 0;
        System.out.println("Please insert n (integer).");
        n = scanner.nextInt();

        //Εντολές και εκτύπωση αποτελέσματος
        for(int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print("*");
                if (j % n == 0) {
                    System.out.println();
                }
            }
        }
    }
}
