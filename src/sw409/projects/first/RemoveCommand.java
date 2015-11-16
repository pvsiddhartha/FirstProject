package sw409.projects.first;

import java.util.List;

public class RemoveCommand {
	//remove shapename from setname.
	public static String parseAndExecute(List<String> commandList, ListOfShapeLists s) {
		if(commandList.size() != 4)
			return "REMOVE: Invalid parameter count.";
		if(commandList.get(2).equals("FROM"))
			return "REMOVE: Syntax error. Please make use of HELP command.";
		String shapeName = commandList.get(1);
		String setName = commandList.get(3);
		Shape shape = s.getListByName(setName).getShapeByName(shapeName);
		ListofNamedShapes set = s.getListByName(setName);
		if(shape == null)
			return "REMOVE : There is not such set.";
		if(setName != null){
			set.removeShapeByName(shapeName);
			return "Shape "+ shapeName + " Removed from set." +setName;
			
		}
		return "Shape not Removed yet?";	
	}
}
