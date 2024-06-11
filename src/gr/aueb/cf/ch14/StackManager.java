package gr.aueb.cf.ch14;

/**
 * Ένα Singleton class που υλοποιεί LIFO(Last In, First Out)
 * μηχανισμό. Παρέχειμεθόδους για εισαγωγή στο τέλος (push)
 * και εξαγωγή από τοτέλος (pop) καθώς και βοηθητικές μέθοδοι
 * (isFull(), isEmpty()).
 */
public class StackManager {

    private static StackManager instance;
    private static final int CAPACITY = 100;
    private String[] stack;
    private int top;

    private StackManager() {
        stack = new String[CAPACITY];
        top = -1;
    }

    //Μέθοδος για απόκτηση της μοναδικής instance.
    public static StackManager getInstance() {
        if (instance == null) {
            instance = new StackManager();
        }
        return instance;
    }

    //Μέθοδος για εισαγωγή στοιχείου στο τέλος.
    public void push(String item) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = item;
    }

    //Μέθοδος για εξαγωγή στοιχείου από το τέλος.
    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }


    //Έλεγχος αν ο stack είναι πλήρης.
    private boolean isFull() {
        return instance.top == CAPACITY - 1;
    }

    //Έλεγχος αν ο stack είναι κενός
    private boolean isEmpty() {
        return instance.top == -1;
    }


}
