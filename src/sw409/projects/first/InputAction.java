package sw409.projects.first;

import java.util.ArrayList;
import java.util.List;

public class InputAction {
	private String returnBuffer = "";
	private Boolean stopLoop = false;
	
	public String getMessage() {
		return returnBuffer;
	}
	
	public Boolean getStopLoop() {
		return stopLoop;
	}
	
	public InputAction(String entryBuffer, ListOfShapeLists allShapes){
		try {
			List<String> entryList = new ArrayList<String>();
			for (String s : entryBuffer.split(" ")) {
				entryList.add(s);
			}
			System.out.println(entryList.get(0));
			switch (entryList.get(0).toUpperCase()) {
			case "EXIT":
				returnBuffer = "Exiting, thank you!";
				stopLoop = true;
				break;
			case "SHOW": 
				//this directs to show command class.
				returnBuffer = ShowCommand.parseAndExecute(entryList, allShapes);
				break;
			case "CREATE":
				//this directs to Create Command Class.
				returnBuffer = CreateCommand.parseAndExecute(entryList, allShapes); 
				break;
			case "DELETE":
				//this directs to Delete Command class.
				returnBuffer = DeleteCommand.parseAndExecute(entryList, allShapes);
				break;
			case "ADD":
				//this directs to Add Command Class.
				 returnBuffer = AddCommand.parseAndExecute(entryList, allShapes);
				break;
			case "REMOVE":
				//this directs to Remove command class
				returnBuffer = RemoveCommand.parseAndExecute(entryList, allShapes);
				break;
			case "CLEAR":
				//this directs to Clear command class
				returnBuffer = ClearCommand.parseAndExecute(entryList, allShapes);
				break;
			case "UNION": 
				returnBuffer = "This one screams STRECH GOAL, eh?";
				break;
			case "COMPARE":
				returnBuffer = CompareCommand.parseAndExecute(entryList,allShapes);
				break;
			case "HELP":
				returnBuffer = getHelpList();
				break;
			default:
				returnBuffer = "You said something starting with " + entryList.get(0).toUpperCase() + ".  Nothing like that here, try HELP or EXIT";
				break;
			}
		}
		catch (Exception e) {
			returnBuffer = "I really shouldn't tell you this, but:\n" + e.getMessage();
		}
	};
	
	
	private String getHelpList() {
		return 
				"Valid Commands:\n" +
				"show shapes - shows a list of all shapes\n" +
				"show sets - shows a list of all sets of shapes\n" +
				"show <setName> - show a list of all shapes in a set\n" +
				"create set <setName> - create a new set\n" +
				"create rectangle <name> length <l> width <w> color <c> - create new rectangle\n" +
				"create circle <name> radius <r> color <c> - create new circle\n" +
				"create square <name> side <s> color <c> - create new square\n" +
				"delete set <setname> - remove the set (not the shapes)\n" + 
				"delete shape <name> - delete the shape (from all sets)\n" +
				"add <name> to <setName> - add a shape to a set\n" +
				"remove <name> from <setName> - remove a shape from a set\n" +
				"compare shape [perimeter|area] <name1> <name2> - compare shapes\n" +
				"compare set [perimeter|area] <setName1> <setName2> - comapre sets\n" +
				"clear set <setName> - remove all shaps from set (leave empty set)\n" +
				"union <setName1> with <setName2> - unify sets into setName1\n";
	}
				
	
	
	
}
