package gr.aueb.cf.ch13.bankapp;

/**
 * Η κλάση OvedraftAccount επιτρέπει την ανάληψη
 * ποσών μεγαλύτερων από το υπόλοιπο του λογαριαμού
 * μέχρι ενός ορίου υπερανάληψης.
 *
 */
public class OverdraftAccount {
    private double balance;
    private double overdraftLimit;

    public OverdraftAccount() {

    }

    /**
     *
     * @param balance
     *               το αρχικό υπόλοιπο του λογαριασμού
     * @param overdraftLimit
     *               το όριο υπερανάληψης.
     */
    public OverdraftAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Επιστρέφει το υπόλοιπο του λογαριασμού.
     * @return Το υπόλοιπο του λογαριασμού.
     */
    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    /**
     * Ορίζει το όριο υπερανάληψης.
     * @param overdraftLimit
     *          Το όριο υπερανάληψης.
     */
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Καταθέτει ένα ποσό στον λογαριασμό.
     * @param amount
     *      Το ποσό προς κατάθεση.
     */
    public void deposit(double amount) {
        balance += amount;
    }


    /**
     * Αναλαμβάνει ένα ποσό από τον λογαριασμό και μας
     * δίνει μήνυμα εάν ο πελάτης ξεπεράσει το όριο ανάληψης.
     * @param amount
     *      Το ποσό ανάληψης.
     * @throws Exception
     *      Όταν το άθροισμα του υπολοίπου του λογαριασμού
     *      και του overdraftLimit είναι μεγαλύτερα από το
     *      ποσό ανάληψης.
     */
    public void withdraw(double amount) throws Exception {
        try {
            if (balance + overdraftLimit <= amount) {
                throw new Exception("You've exceeded the withdrawal limit!");
            }
            balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }




}
