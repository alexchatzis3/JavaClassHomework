package gr.aueb.cf.exercises.ch2;

import java.util.Scanner;

/**
 * Πρόγραμμα που μετατρέπει ακέραιες θερμοκρασίες Fahrenheit
 * στην κλίμακα κελσίου.
 */
public class FahrenheitApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        //Εντολές
        System.out.println("Please insert Fahrenheit temperature.");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        //Εκτύπωση αποτελέσματος
        System.out.printf("%d Fahrenheit is %d degrees Celsius",
                fahrenheit, celsius);
    }
}
