package sw409.projects.first;

import java.util.List;

public class CompareCommand {
	//	compare shape [perimeter|area] <shapeName1> <shapeName2>
	//	compare SET [perimeter|area] <shapeName1> <shapeName2>
	private enum operations	{AREA,PERIMETER};
	public static String parseAndExecute(List<String> commandlist, ListOfShapeLists s){
		if(commandlist.size() != 5)
			return "COMPARE: Ivalid parameter count";
		String compare1 = commandlist.get(1);
		String compare2 = commandlist.get(2);
		String item1 = commandlist.get(3);
		String item2 = commandlist.get(4);
		
		if(compare1.toUpperCase().equals("SET") && compare2.toUpperCase().equals("AREA"))
			return compareSet(item1,item2,operations.AREA,s);
		if(compare1.toUpperCase().equals("SET") && compare2.toUpperCase().equals("PERIMETER"))
			return compareSet(item1, item2, operations.PERIMETER, s);
		if(compare1.toUpperCase().equals("SHAPE") && compare2.toUpperCase().equals("AREA"))
			return compareShape(item1,item2,operations.AREA,s);
		if(compare1.toUpperCase().equals(item1) && compare2.toUpperCase().equals("PERIMETER"))
			return compareShape(item1, item2, operations.PERIMETER, s);
		
		return "COMPARE COMMAND: Please make use of help command.";
	
	}
	private static String compareShape(String item1, String item2, operations area, ListOfShapeLists s) {
		// TODO Auto-generated method stub
		ListofNamedShapes set1 = s.getListByName(item1);
		if(set1 == null)
			return "COMPARE SHAPE: Set does not exists.";
		ListofNamedShapes set2 = s.getListByName(item2);
		if(set2 == null)
			return "COMPARE SHAPE: Set2 does not exists";
		
		return null;
	}
	private static String compareSet(String item1, String item2, operations area, ListOfShapeLists s) {
		// TODO Auto-generated method stub
		ListofNamedShapes set1 = s.getListByName(item1);
		if(set1 == null)
			return "COMPARE SET: Set does not exists.";
		ListofNamedShapes set2 = s.getListByName(item2);
		if(set2 == null)
			return "COMPARE SET: Set2 does not exists";
		
		return null;
	}
}
