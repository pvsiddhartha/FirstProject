package sw409.projects.first;

public class Rectangle implements Shape {
	private double length;
	private double width;
	private Color color;
	
	public Rectangle(double len, double wid, Color c) {
		SetLength(len);
		SetWidth(wid);
		SetColor(c);
	}
	
	public String Describe() {
		return "This is a " + color + " rectangle of length " + length + " and width " + width;
	}
	
	public double GetLength() {
		return length;
	}
	
	public void SetLength(double len) {
		length = len;
	}
	
	public double GetWidth() {
		return width;
	}
	
	public void SetWidth(double wid) {
		width = wid;
	}

	@Override
	public double GetArea() {
		return  length * width;
	}

	@Override
	public double GetPerimeter() {
		return (2 * length) + (2 * width);
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
