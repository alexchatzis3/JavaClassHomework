package gr.aueb.cf.ch14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Singleton κλάση με όνομα {@link Logger}, που κάνει
 * log messages στο System.err.
 */
public class Logger {

    private static Logger instance;

    private Logger() {

    }

    /**
     *
     * @return
     *      επιστρέφει τη μοναδική instance.
     */
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }


    /**
     *
     * @param message
     *      το μήνυμα ακολουθούμενο από ένα timestamp.
     */
    public void logMessage(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.err.println( message + " (" + timestamp + ")");
    }


}
