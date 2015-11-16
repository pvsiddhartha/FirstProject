package sw409.projects.first;

import java.util.List;

public class AddCommand {

	public static String parseAndExecute (List<String> commandList, ListOfShapeLists s){
		if (commandList.size() != 4)
			return "Illegal instruction passed, please make use of HELP command";
		String shapeName = commandList.get(1);
		String setName = commandList.get(3);
		//add "ALL" as default.
		Shape shape = s.getListByName(setName).getShapeByName(shapeName);
		//if(shape == null ) return "ADD Command: No Such shape";
		ListofNamedShapes set = s.getListByName(setName);
		if(set == null)
			return "ADD Command: There is no such set created.";
		if(set.addShapeByName(setName, shape)){
			set.addShapeByName(shapeName, shape);
			return "ShapeName:::"+shapeName+" added to set :::"+setName;
		}
		return "Shape not added ?";
	}
}
  