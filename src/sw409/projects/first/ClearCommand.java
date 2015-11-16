package sw409.projects.first;

import java.util.List;

public class ClearCommand {
	
	//clear set SETNAME.
	public static String parseAndExecute(List<String> commandList, ListOfShapeLists s){
		
		if(commandList.size() != 3)
			return "CLEAR SET: Invalid parameter count. ";
		if(!commandList.get(1).toUpperCase().equals("SET"))
			return "CLEAR SET: Missing token set name";
		ListofNamedShapes set = s.getListByName(commandList.get(2));
		if(set == null)
			return "CLEAR SET: Set " +commandList.get(2) +" does not exist";
		set.clear();
	
		return "CLEAR SET : Set has been cleared..";
	}
}
