import java.util.Scanner;

public class settings{
	private static Scanner in;
	
	public static String gameChoice(){
		return "";
	}

	public static int gameSize(){
		
		cleanup();
		return "";
	}

	/* init the scanner */
	private void initScanner(){
		in = new Scanner();
	}

	/* shutdown the scanner */
	private void cleanup(){
		in.close();
	}
}
		
		
