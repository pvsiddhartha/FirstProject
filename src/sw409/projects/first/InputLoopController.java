package sw409.projects.first;

import java.io.IOException;
import java.io.PrintStream;

public class InputLoopController {
	private PrintStream out;
	private ListOfShapeLists allLists;

	private void InitializeDataFromDatabase() {
		allLists = new MapOfShapeLists();
		// TODO: get all the lists from the database
	}
	
	
	
	private void promptForInput() {
		out.println();
		out.println("Welcome to the Shape List Management System");
		out.println("Enter a Command, or HELP, or EXIT:");
	};
	
	private String getALineOfInput() throws IOException {
		String buffer = "";
		while (true) {
			int data = System.in.read();
			if (data == -1) continue;
			if ( (data == 13) || (data == 10) ) {
				data = System.in.read();
				break;
			}
			buffer += (char)data;
		}

		return buffer;
	};

	
	public InputLoopController() {
		out = System.out;
		InitializeDataFromDatabase();
	};

	
	public void runInputLoop() {
		String entryBuffer = "";
		
		try {
			while (true) {
				promptForInput();
				entryBuffer = getALineOfInput();
				InputAction i = new InputAction(entryBuffer, allLists);
				out.println();
				out.println("Command Processed:");
				out.println(i.getMessage());
				out.println();
				if (i.getStopLoop()) break;
			}
		}
		catch (IOException e) {
			out.println("Ah damn, some stupid IO thing happened, looked like " + e.getMessage());
			out.println("BAILING THIS BUGGY SCENE RIGHT MEOW!");
		}
	};
	
	

}
