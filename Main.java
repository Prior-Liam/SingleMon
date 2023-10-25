public class Main {

	public static void main(String[] args){

		Logger loggingBase = Logger.getInstance();
        
        loggingBase.setLevel("ALL");
        System.out.println(loggingBase.getLevel());

        loggingBase.trace("Trace");
        loggingBase.debug("Debug");
        loggingBase.info("Info");
        loggingBase.warn("Warn");
        loggingBase.error("Error");
        loggingBase.fatal("Fatal");

        loggingBase.setLevel("DEBUG");
        System.out.println(loggingBase.getLevel());

        loggingBase.trace("Trace");
        loggingBase.debug("Debug");
        loggingBase.info("Info");
        loggingBase.warn("Warn");
        loggingBase.error("Error");
        loggingBase.fatal("Fatal");

        loggingBase.setLevel("INFO");
        System.out.println(loggingBase.getLevel());

        loggingBase.trace("Trace");
        loggingBase.debug("Debug");
        loggingBase.info("Info");
        loggingBase.warn("Warn");
        loggingBase.error("Error");
        loggingBase.fatal("Fatal");

        loggingBase.setLevel("WARN");
        System.out.println(loggingBase.getLevel());

        loggingBase.trace("Trace");
        loggingBase.debug("Debug");
        loggingBase.info("Info");
        loggingBase.warn("Warn");
        loggingBase.error("Error");
        loggingBase.fatal("Fatal");

        loggingBase.setLevel("ERROR");
        System.out.println(loggingBase.getLevel());

        loggingBase.trace("Trace");
        loggingBase.debug("Debug");
        loggingBase.info("Info");
        loggingBase.warn("Warn");
        loggingBase.error("Error");
        loggingBase.fatal("Fatal");

        loggingBase.setLevel("FATAL");
        System.out.println(loggingBase.getLevel());

        loggingBase.trace("Trace");
        loggingBase.debug("Debug");
        loggingBase.info("Info");
        loggingBase.warn("Warn");
        loggingBase.error("Error");
        loggingBase.fatal("Fatal");

        loggingBase.setLevel("OFF");
        System.out.println(loggingBase.getLevel());

        loggingBase.trace("Trace");
        loggingBase.debug("Debug");
        loggingBase.info("Info");
        loggingBase.warn("Warn");
        loggingBase.error("Error");
        loggingBase.fatal("Fatal");
	
	}
}