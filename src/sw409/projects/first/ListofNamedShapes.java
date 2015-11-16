package sw409.projects.first;

public interface ListofNamedShapes {
	
	public void clear();
	public Shape getShapeByName(String name);
	public Boolean addShapeByName(String name, Shape s);
	public Boolean removeShapeByName(String name);
	

}
