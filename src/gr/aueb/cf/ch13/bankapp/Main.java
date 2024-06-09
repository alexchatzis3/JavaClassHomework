package gr.aueb.cf.ch13.bankapp;


public class Main {

    public static void main(String[] args) throws Exception {

        //Δημιουργία overdraftAccount και έλεγχος
        OverdraftAccount overdraftAccount = new OverdraftAccount(250.0, 1000.0);
        System.out.println("Overdraft Account Balance: " + overdraftAccount.getBalance());
        overdraftAccount.deposit(250.0);
        System.out.println("Balance after deposit: " + overdraftAccount.getBalance());
        overdraftAccount.withdraw(100.0);
        System.out.println("Balance after withdraw: " + overdraftAccount.getBalance());
//        overdraftAccount.withdraw(1400);
//        System.out.println(overdraftAccount.getBalance());

        //Δημιουργία jointAccount και έλεγχος
        JointAccount jointAccount = new JointAccount(300.5, "John", "Maria");
        System.out.println("The holders of the joint account are: " + jointAccount.convertToString());
        jointAccount.deposit(240.4);
        System.out.println("Balance after deposit: " + jointAccount.getBalance());
        jointAccount.withdraw(36.0);
        System.out.println("Balance after withdraw: " + jointAccount.getBalance());
        jointAccount.withdraw(600);
        System.out.println(overdraftAccount.getBalance());

    }
}
