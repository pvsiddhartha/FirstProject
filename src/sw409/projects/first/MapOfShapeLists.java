package sw409.projects.first;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapOfShapeLists implements ListOfShapeLists {
	private Map <String, ListofNamedShapes> listOfLists;

	public MapOfShapeLists() {
		listOfLists = new HashMap<String, ListofNamedShapes>();
	}
	
	
	@Override
	public void clear() {
		listOfLists.clear();
	}

	@Override
	public Boolean addListByName(String name, ListofNamedShapes shapeList) {
		if (listOfLists.keySet().contains(name)) return false;
		listOfLists.put(name, shapeList);
		return true;
	}

	@Override
	public ListofNamedShapes getListByName(String name) {
		return listOfLists.get(name);
	}

	@Override
	public Boolean deleteListByName(String name) {
		ListofNamedShapes lns = listOfLists.remove(name);
		return (lns != null);
	}


	@Override
	public Set<String> getSetNames() {
		// TODO Auto-generated method stub
		Set<String> returnset = new HashSet<>(listOfLists.keySet());
		returnset.remove("ALL");
		return returnset;
	}

}
