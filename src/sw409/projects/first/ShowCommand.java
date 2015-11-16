package sw409.projects.first;

import java.util.List;

public class ShowCommand {
	public static String parseAndExecute(List<String> commandList, ListOfShapeLists s) {
		
		if(commandList.size() < 2)
			return "SHOW: Invalid Parameter count";
		switch (commandList.get(1).toUpperCase()) {
		case "SETS" :
			return parseAndExecuteShowSetsCommand(commandList,s);
		case "SET" :
			return parseAndExecuteShowSetCommand(commandList, s);
		case "SHAPES" :
			return parseAndExecuteShowShapesCommand(commandList, s);
		case "SHAPE":
			return parseAndExecuteShowShapeCommand(commandList, s);
		default:
			return "SHOW: It was not supported. Please try HELP command.";
		}

	}
	//show sets
	private static String parseAndExecuteShowSetCommand(List<String> commandList, ListOfShapeLists s) {
		// TODO Auto-generated method stub
		if(commandList.size() != 2)
			return "SHOW SETS: Invalid parameter count";
		//to show all the sets in the system.
		String nameOfSets = "";
		
		return null;
	}

	private static String parseAndExecuteShowSetsCommand(List<String> commandList, ListOfShapeLists s) {
		// TODO Auto-generated method stub
		if(commandList.size() != 2)
			return "SHOW SETS: Invalid parameter count";
		return null;
	}
	
	private static String parseAndExecuteShowShapeCommand(List<String> commandList, ListOfShapeLists s) {
		// TODO Auto-generated method stub
		if(commandList.size() != 2)
			return "SHOW SETS: Invalid parameter count";
		return null;
	}

	private static String parseAndExecuteShowShapesCommand(List<String> commandList, ListOfShapeLists s) {
		// TODO Auto-generated method stub
		if(commandList.size() != 3)
			return "SHOW SHAPES: Invalid parameter count";
		return null;
	}


	
}
