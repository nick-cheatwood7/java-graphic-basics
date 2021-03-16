import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
	
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		// constructor
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// Getters & Setters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getRadius() {
		return radius;
	}
	
	void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "X: " + x +"\nY: " + y +"\nRadius: " + radius;
	}
	
	
	@Override
	public void paint(Graphics g) {
		// Paint the square here
		g.setColor(Color.MAGENTA);
	    g.fillOval(x, y, radius, radius);
	}

}
