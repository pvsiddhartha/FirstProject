package sw409.projects.first;

public class Main {

	public static void main(String[] args) {
		try {
			InputLoopController mainControlLoop = new InputLoopController();
 			mainControlLoop.runInputLoop();
		}
		catch (Exception e) {
			System.out.println();
			System.out.println("*** UNHANDLED EXCEPTION, PROGRAM TERMINATING! ***");
			System.out.println(e.getMessage());
		}
	}
}
