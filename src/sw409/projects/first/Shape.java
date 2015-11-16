package sw409.projects.first;

public interface Shape {
	public enum Color { WHITE, RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET, BLACK } ;
	
	public static Color matchColorString(String colorString){
		switch(colorString.toUpperCase()){
		
		case "WHITE"  : return Color.WHITE;
		case "RED"    : return Color.RED;
		case "ORANGE" : return Color.ORANGE;
		case "YELLOW" : return Color.YELLOW;
		case "GREEN"  : return Color.GREEN;
		case "BLUE"   : return Color.BLUE;
		case "INDIGO" : return Color.INDIGO;
		case "VIOLET" : return Color.VIOLET;
		case "BLACK"  : return Color.BLACK;
		
		default:
				return Color.BLACK;
		}
	}
	public double GetArea();
	public double GetPerimeter();
	public void SetColor (Shape.Color c);
	public Shape.Color GetColor();
	public String Describe();
	
	public default String SaveToDatabase() {
		return "SAVE NOT IMPLEMENTED FOR THIS SHAPE";
	}
	
}
