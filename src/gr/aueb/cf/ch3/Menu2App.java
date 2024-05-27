package gr.aueb.cf.exercises.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού με επιλογές μέχρι ο χρήστης
 * να δώσει τον αριθμό 5.
 */
public class Menu2App {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        //Εντολές και εκτύπωση αποτελέσματος
        do {
            System.out.println("Please enter number between 1 and 5");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Update");
            System.out.println("4.Search");
            System.out.println("5.Exit");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You chose Insert.");
            } else if (choice == 2) {
                System.out.println("You chose Delete.");
            } else if (choice == 3) {
                System.out.println("You chose Update.");
            } else if (choice == 4) {
                System.out.println("You chose Search.");
            } else if (choice == 5) {
                System.out.println("You chose Exit.");
            } else {
                System.out.println("Wrong choice. Please try again.");
            }
        } while (choice != 5);

        System.out.println("Thank you for using the app!");
    }
}
