package gr.aueb.cf.ch14.challenges;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static final Logger loggerInstance = new Logger();

    private Logger() {

    };

    public static Logger getInstance() {
        return loggerInstance;
    }

    public static void logErrMessage(String message) {
        System.err.println(message);
    }

    public static void logMessage (String message) {
        String timestamp = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());
        System.out.println("[" + timestamp + "] " + message);
    }
}
