package gr.aueb.cf.exercises.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει ν γραμμές όπου το ν το δίνει ο χρήστης.
 * 1η γραμμή -> ν αστεράκια
 * 2η γραμμή -> ν-1 αστεράκια
 */
public class StarsDesc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Δήλωση και αρχικοποίηση μεταβλητών
        int n = 0;
        System.out.println("Please insert n (integer).");
        n = scanner.nextInt();

        //Εντολές και εκτύπωση αποτελέσματος
        for (int i = 1; i<=n; i++) {
            for (int j = n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
