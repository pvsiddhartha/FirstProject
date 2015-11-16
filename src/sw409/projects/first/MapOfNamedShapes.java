package sw409.projects.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOfNamedShapes implements ListofNamedShapes {
	private Map<String, Shape> shapeList;
	
	public MapOfNamedShapes() {
		shapeList = new HashMap<String, Shape>();
	}

	//to empty the shapelist.
	public void clear() {
		shapeList.clear();
	}
	
	
	public Shape getShapeByName(String name) {
		return shapeList.get(name);
		
	}
	
	
	public Boolean addShapeByName(String name, Shape s) {
		if (shapeList.get(name) != null) return false;
		shapeList.put(name, s);
		return true;
	}
	
	
	public Boolean removeShapeByName(String name) {
		if (shapeList.remove(name) == null) return false;
		return true;
	}
	//implementations for iterating the shapeList.
	
	public Integer size(){
		return shapeList.size();
	}
	
	public Set<String> getShapeName(){
		return shapeList.keySet();
	}
}
