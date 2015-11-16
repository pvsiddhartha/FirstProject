package sw409.projects.first;

import java.util.Set;

public interface ListOfShapeLists {
	public void clear();
	public Boolean addListByName(String name, ListofNamedShapes shapeList);
	public ListofNamedShapes getListByName(String name);
	public Boolean deleteListByName(String name);
	
	//set to store all LISTNAMES.
	public Set<String> getSetNames();

}
