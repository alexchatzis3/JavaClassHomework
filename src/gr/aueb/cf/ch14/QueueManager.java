package gr.aueb.cf.ch14;

/**
 * Ένα Singleton class που υλοποιεί ένα FIFO (First In, First Out)
 * μηχανισμό. Παρέχονται μέθοδοι για εισαγωγή στο τέλος (enqueue)
 * και εξαγωγή από την αρχή (dequeue) καθώς και βοηθητικές μέθοδοι
 * (isFull(), isEmpty().
 */
public class QueueManager {

    private static QueueManager instance;
    private static final int CAPACITY = 100;
    private int[] queue;
    private int front; //πρώτο στοιχείο.
    private int rear; //τελευταίο στοιχείο.
    private int size; //μέγεθος ουράς.

    private QueueManager() {
        queue = new int[CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    //Μέθοδος για απόκτηση της μοναδικής instance.
    public static QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    //Μέθοδος για εισαγωγή στοιχείου στο τέλος
    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % CAPACITY;
        queue[rear] = item;
        size++;
    }


    //Μέθοδος για εξαγωγή στοιχείου από την αρχή.
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = queue[front];
        front = (front + 1) % CAPACITY;
        size--;
        return item;
    }

    //Έλεγχος αν η ουρά είναι πλήρης.
    private static boolean isFull() {
        return instance.size == CAPACITY;
    }

    //Έλεγχος αν η ουρά είναι κενή.
    private static boolean isEmpty() {
        return instance.size == 0;
    }


}
