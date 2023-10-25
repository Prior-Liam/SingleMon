public class Main {

	public static void main(String[] args){

		Logger loggingBase = Logger.getInstance();
        loggingBase.setLevel("DEBUG");
        System.out.println(loggingBase.getLevel());
	
	}
}