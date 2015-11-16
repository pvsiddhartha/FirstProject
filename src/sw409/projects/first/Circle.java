package sw409.projects.first;

public class Circle implements Shape {
	private double radius;
	private double Pi = 3.14159265;
	private Color color;
	
	public Circle(double rad, Color c) {
		SetRadius(rad);
		SetColor(c);
	}
	
	public String Describe() {
		return "This is a " + color + " circle of radius " + radius;
	}
	
	public double GetRadius() {
		return radius;
	}
	
	public void SetRadius(double rad) {
		radius = rad;
	}

	@Override
	public double GetArea() {
		return  Pi * radius * radius;
	}

	@Override
	public double GetPerimeter() {
		return 2 * Pi * radius;
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
