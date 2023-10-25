public class Logger {
    private static Logger uniqueLogger;
    private Logger() {

    }
    public static synchronized getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Logger();
        }
        return uniqueInstance;
    }
}