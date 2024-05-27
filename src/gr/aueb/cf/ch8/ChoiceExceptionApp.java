package gr.aueb.cf.exercises.ch8;


import java.io.IOException;
import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού με επιλογές από 1 έως 4 (και 5 για Exit) καθώς και
 * μια μέθοδο int getChoice() για να διαβάσουμε το choice του χρήστη με Scanner.
 */
public class ChoiceExceptionApp {

    //Scanner για να δώσει ο χρήστης μέσω standard input ακέραιο
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        //Δήλωση και αρχικοποίηση μεταβλητής
        int choice = 0;

        //Εντολές και εκτύπωση αποτελέσματος
        choice = getChoice();
        if (choice <1 || choice > 5) {
            throw new IllegalArgumentException("Λάθος επιλογή. Παρακαλώ εισάγετε αριθμό μεταξύ 1 και 5");
        }
        printChoice(choice);

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή.");

    }

    //Μέθοδος για εμφάνιση του μενού επιλογών
    public static void printMenu () {
        System.out.println("Επιλέξτε παρακαλώ ένα από τα παρακάτω: ");
        System.out.println("1. 1η επιλογή");
        System.out.println("2. 2η επιλογή");
        System.out.println("3. 3η επιλογή");
        System.out.println("4. 4η επιλογή");
        System.out.println("5.Έξοδος");
    }

    /**
     *          Μέθοδος που επιστρέφει την επιλογή του χρήστη έπειτα από έλεγχο για το εάν
     *          δώθηκε ακέραιος
     * @return  ο ακέραιος που έδωσε ο χρήστης στο standard input
     */
    public static int getChoice(){
        int choice;

        while (true) {
            printMenu();
            if (in.hasNextInt()) {
                choice = in.nextInt();
            } else {
                System.out.println("Λάθος επιλογή. Παρακαλώ εισάγετε ακέραιο.");
                in.nextLine();
                continue;
            }
            return choice;
        }

    }

    /**
     *                  εκτυπώνει τον επιλογή του χρήστη από το μενού
     * @param choice    ο ακέραιος που επέλεξε ο χρήστης
     */

    public static void printChoice(int choice) {
        System.out.println("Επιλέξατε : " + choice);
    }


}
