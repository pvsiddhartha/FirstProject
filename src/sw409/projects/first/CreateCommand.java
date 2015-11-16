package sw409.projects.first;

import java.util.List;

public class CreateCommand {
	public static String parseAndExecute(List<String> commandList, ListOfShapeLists s) {
		if (commandList.size() < 2)
			return "CREATE requires more than just one word.  Try HELP if you need it.";
		System.out.println("Get[1]::"+commandList.get(1));
		switch (commandList.get(1).toUpperCase()) {
		case "SET":
			return parseAndExecuteCreateSetCommand(commandList, s);
		case "CIRCLE":
			return parseAndExecuteCreateCircleCommand(commandList, s);
		case "SQUARE":
			return parseAndExecuteCreateSquareCommand(commandList, s);
		case "RECTANGLE":
			return parseAndExecuteCreateRectangleCommand(commandList, s);
		default:
			return "CREATE whatever that was is not supported.  Try HELP if you need it.";
				
		}
	}
	//this method is for creating a set.
	private static String parseAndExecuteCreateSetCommand(List<String> commandList, ListOfShapeLists s) {
		if(commandList.size()!= 3) 
			return "Illegal instruction given, please try again or make use of HELP command.";
		String setName = commandList.get(2);
		//get(2) will gets the setName from user prompt.		
		//to check if a set with the given name already exists
		if(setName != null){
			if(s.getListByName(setName) != null)
				return "Set: " +setName + " already exists.";
		}
		if(setName != null){
			ListofNamedShapes newSet = new MapOfNamedShapes();
			s.addListByName(setName, newSet);		
			return "CREATE SET :: Set Name::"+ setName +" created";
		}
		return "Set not created? ";
	}
	//	create circle <shapeName> radius <r> color <c> 
	@SuppressWarnings("unused")
	private static String parseAndExecuteCreateCircleCommand(List<String> commandList, ListOfShapeLists s) {
		if(commandList.size() != 7)
			return "CREATE CIRCLE ::: Illegal instruction given, please try again or make use of HELP Command";
		String circleName = commandList.get(2);
		if(!circleName.matches("[a-zA-Z0-9]+"))
			return "CREATE CIRLCE::: Invalid Circle name";
		if(!commandList.get(3).toUpperCase().equals("RADIUS"))
			return "CREATE CIRCLE::: Please give input as RADIUS";
		//got the circle radius from user input.
		try{
			Double.parseDouble(commandList.get(4));
		}catch(NumberFormatException e){
			return "CREATE CIRCLE:: Please enter valid input.(Radius was not a double)";
		}
		if(!commandList.get(5).toUpperCase().equals("COLOR"))
			return "CREATE CIRCLE:: Please enter input as COLOR";
		//validating the given color.
		String colorGiven = commandList.get(6);
		if(circleName!= null){
			ListofNamedShapes newSet = new MapOfNamedShapes();
			//add a circle to "ALL" list item.
			s.getListByName("ALL").addShapeByName(circleName,(Shape) s );
			return "CREATE CIRCLE:::"+circleName+" Created";
		}
		return "CREATE CIRCLE: Not implemented yet";
	}
	//	create square <shapeName> side <s> color <c>
	@SuppressWarnings("unused")
	private static String parseAndExecuteCreateSquareCommand(List<String> commandList, ListOfShapeLists s) {
		if(commandList.size() != 7)
			return "CREATE SQUARE:: Illegal Instruction given, please try again.";
		String squareName = commandList.get(2);
		if(!squareName.matches("[a-zA-Z0-9]+"))
			return "CREATE SQUARE:: Invalid Square Name";
		if(!commandList.get(3).toUpperCase().equals("SIDE"))
			return "CREATE SQUARE:: Please give input as SIDE while giving side of a square ";
		try{
			Double.parseDouble(commandList.get(4));
		}catch(NumberFormatException e ){
			return "CREATE SQUARE:::Please enter valid input - Side was not a double.";
		}
		if(!commandList.get(5).toUpperCase().equals("COLOR"))
			return "CREATE SQUARE: Please enter input as color.";
		String colorGiven = commandList.get(6);
		System.out.println(colorGiven);
		if(squareName!= null){
			s.getListByName("ALL").addShapeByName(squareName, (Shape)s);	//????
			return "CREATE SQUARE:: "+squareName+" Created";
		
		}
		return "CREATE SQUARE: Not implemented yet";
	}

	//create rectangle <shapeName> length <l> width <w> color <c>
	@SuppressWarnings("unused")
	private static String parseAndExecuteCreateRectangleCommand(List<String> commandList, ListOfShapeLists s) {
		if(commandList.size() != 9)
			return "CREATE RECTANGLE:: Illegal Instruction given, please try again.";
		String rectangleName = commandList.get(2);
		if(!rectangleName.matches("[a-zA-Z0-9]+"))
			return "CREATE RECTANGLE: Invalid rectangle name";
		if(!commandList.get(3).toUpperCase().equals("LENGTH"))
			return "CREATE RECTANGLE: Please give input as Length while giving length of a rectangle";
		try{
			Double.parseDouble(commandList.get(4));
		}catch(NumberFormatException e){
			return "CREATE RECTANGLE: Please enter valid input - Length was not a double.";
		}
		if(!commandList.get(5).toUpperCase().equals("WIDTH"))
			return "CREATE RECTANGLE: Please give input as Width while giving width of a rectangle";
		try{
			Double.parseDouble(commandList.get(6));
		}catch(NumberFormatException e){
			return "CREATE RECTANGLE: Please enter valid input - Width was not a double.";
		}
		
		if(!commandList.get(7).toUpperCase().equals("COLOR"))
			return "CREATE RECTANGLE: Please enter as COLOR while giving color to shape";
		String colorGiven = commandList.get(8);
		System.out.println(colorGiven);
		if(rectangleName != null){
			s.getListByName("ALL").addShapeByName(rectangleName, (Shape) s);	
			return "CREATE RECTANGLE:: "+rectangleName+ " Created.";
		}
		return "CREATE RECTANGLE: Not implemented yet";
	}

}
