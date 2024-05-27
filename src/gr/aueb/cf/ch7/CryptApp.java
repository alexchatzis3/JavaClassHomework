package gr.aueb.cf.exercises.ch7;

import java.util.Scanner;

/**
 * Πρόγραμμα για κρυπτογράφηση. Αντικαθιστά κάθε χαρακτήρα του String
 * με τον λεξικογραφικά επόμενο. Tο string δίνεται μέσω standard input.
 */
public class CryptApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Δήλωση και αρχικοποίηση μεταβλητών
        String string;
        String newString = "";
        char  ch1;

        //Εντολές
        System.out.println("Please enter string");
        string = scanner.nextLine();
        System.out.println("The new string is: ");

        //Εκτύπωση αποτελέσματος
        for(int i=0; i < string.length(); i++){
            char ch = string.charAt(i);
            ch1 = (char) (ch + 1);
            System.out.print((ch1));
        }

    }




}
