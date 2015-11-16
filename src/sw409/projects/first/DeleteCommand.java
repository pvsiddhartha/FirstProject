package sw409.projects.first;

import java.util.List;

public class DeleteCommand {
	public static String parseAndExecute(List<String> commandList, ListOfShapeLists s) {
		
		if(commandList.size() < 2)
			return "DELETE Command requires more than one word. Try help if you need it";
		switch(commandList.get(1).toUpperCase()){
			case "SET":
				return parseAndExecuteDeleteSetCommand(commandList, s);
			case "SHAPE":
				return parseAndExeuteDeleteShapeCommand(commandList, s);
			default:
				return "DELETE Command requires more than one word. Try help if you need it";
		}
	}
	//delete set <setName>
	public static String parseAndExecuteDeleteSetCommand(List<String> commandList, ListOfShapeLists s){
		if(commandList.size() != 3)
			return "DELETE SET : Invalid Parameter count.";
		String setName = commandList.get(2);
		ListofNamedShapes set = s.getListByName(setName);
		if(set == null)
			return "DELETE SET : There is no such  "+setName+" set.";
		if(s.deleteListByName(setName)){
			s.deleteListByName(setName);
			return "Set " +setName+ "Deleted";
		}
		return " DELETE SET: Not Implemented yet ?";
		
	}
	//	delete shape <shapeName>
	public static String parseAndExeuteDeleteShapeCommand(List<String> commandList, ListOfShapeLists s){
		if(commandList.size() != 3)
			return "DELETE SHAPE: Invalid Parameter count.";
		String shapeName = commandList.get(2);
		ListofNamedShapes set = s.getListByName("ALL");
		Shape shape = set.getShapeByName(shapeName);
		if(shape == null)
			return "DELETE SHAPE: Shape does not exists";
		if(set.removeShapeByName(shapeName)){
			set.removeShapeByName(shapeName);
			//have to write code for delete the shapeName in all the other sets.
			return "Delete Shape: Shape name " + shapeName + " deleted.";
		}
			
		
		return "DELETE SHAPE: Not Implemented Yet ?";
	}
	
	
}
