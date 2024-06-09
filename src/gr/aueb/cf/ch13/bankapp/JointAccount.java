package gr.aueb.cf.ch13.bankapp;

/**
 * Αντιπροσωπεύει έναν κοινό λογαριασμό με
 * δύο κατόχους.
 */
public class JointAccount {
    private double balance;
    private String holder1;
    private String holder2;

    public JointAccount(){

    }

    /**
     *
     * @param balance
     *      Το αρχικό υπόλοιπο του λογαριασμού.
     * @param holder1
     *      Το όνομα του πρώτου κατόχου.
     * @param holder2
     *      Το όνομα του δεύτερου κατόχου.
     */
    public JointAccount(double balance, String holder1, String holder2) {
        this.balance = balance;
        this.holder1 = holder1;
        this.holder2 = holder2;
    }

    /**
     * Επιστρέφει το υπόλοιπο του λογαριασμού.
     * @return
     *      Το υπόλοιπο του λογαριασμού.
     */
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Επιστρέφει το όνομα του πρώτου κατόχου.
     * @return
     *      Το όνομα του πρώτου κατόχου.
     */
    public String getHolder1() {
        return holder1;
    }

    public void setHolder1(String holder1) {
        this.holder1 = holder1;
    }

    /**
     * Επιστρέφει το όνομα του δεύτερου κατόχου.
     * @return
     *      Το όνομα του δεύτερου κατόχου.
     */
    public String getHolder2() {
        return holder2;
    }

    public void setHolder2(String holder2) {
        this.holder2 = holder2;
    }

    /**
     * Επιστρέφει ένα String με τα ονόματα των δύο
     * κατόχων του λογαριασμού.
     * @return
     *      Τα ονόματα και των δύο κατόχων.
     */
    public String convertToString() {
        return "(" + holder1 + ", " + holder2 + ")";
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
     *      Το ποσό προς ανάληψη.
     * @throws Exception
     *      Όταν το ποσό ανάληψης υπερβαίνει το
     *      υπόλοιπο του λογαριασμού.
     */
    public void withdraw(double amount) throws Exception {
        try {
            if (balance <= amount){
                throw new Exception("You exceeded your withdrawal limit!");
            }
            balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }



}
