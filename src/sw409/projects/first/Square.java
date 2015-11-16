package sw409.projects.first;

public class Square implements Shape {
	private double side;
	private Color color;
	
	public Square(double sd, Color c) {
		SetSide(sd);
		SetColor(c);
	}
	
	public String Describe() {
		return "This is a " + color + " square with side " + side;
	}
	
	public double GetSide() {
		return side;
	}
	
	public void SetSide(double sd) {
		side = sd;
	}

	@Override
	public double GetArea() {
		return  side * side;
	}

	@Override
	public double GetPerimeter() {
		return 4 * side;
	}

	@Override
	public void SetColor(Color c) {
		color = c;
	}

	@Override
	public Color GetColor() {
		return color;
	}


}
