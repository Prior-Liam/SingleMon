public class Logger {
    private static Logger uniqueLogger;
    public String[] levels = {"ALL", "DEBUG", "INFO", "WARN", "ERROR", "FATAL", "OFF"};
    private int currentLevelInt;
    private Logger() {
        currentLevelInt= 0; //set to ALL
    }
    public static synchronized Logger getInstance() {
        if (uniqueLogger == null) {
            uniqueLogger = new Logger();
        }
        return uniqueLogger;
    }

    public void setLevel(String newLevel) {
        currentLevelInt = getLevelInt(newLevel);
    }
    public String getLevel() {
        return levels[currentLevelInt];
    }
    private int getLevelInt(String newLevel) {
        //get index from string
        int levelInt;
        for (int i=0; i<8;i++) {
            if (newLevel == levels[i]) {
                return i;
            }
        }
        return -1;
    }
    public void trace(String message) {
        if (currentLevelInt <= getLevelInt("ALL")) { //trace prints only when ALL is on
            System.out.println(message);
        }
    }
    public void debug(String message) {
        if (currentLevelInt <= getLevelInt("DEBUG")) {
            System.out.println(message);
        }
    }
    public void info(String message) {
        if (currentLevelInt <= getLevelInt("INFO")) {
            System.out.println(message);
        }
    }
    public void warn(String message) {
        if (currentLevelInt <= getLevelInt("WARN")) {
            System.out.println(message);
        }
    }
    public void error(String message) {
        if (currentLevelInt <= getLevelInt("ERROR")) {
            System.out.println(message);
        }
    }
    public void fatal(String message) {
        if (currentLevelInt <= getLevelInt("FATAL")) {
            System.out.println(message);
        }
    }
    // no function for off or all
}