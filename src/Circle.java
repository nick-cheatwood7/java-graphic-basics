import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		// constructor
		this.radius = radius;
	}

	// Getters & Setters
	public int getRadius() {
		return radius;
	}

	void setRadius(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "X: " + super.getX() + "\nY: " + super.getY() + "\nRadius: " + radius;
	}

	@Override
	public void paint(Graphics g) {
		// Paint the square here
		g.setColor(Color.MAGENTA);
		g.fillOval(super.getX(), super.getY(), radius, radius);
	}

}
