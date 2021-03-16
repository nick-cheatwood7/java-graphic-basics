
import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {
	
	private int x;
	private int y;
	private int width;
	
	public Square(int x, int y, int width) {
		// constructor
		this.x = x;
		this.y = y;
		this.width = width;
	}
	
	// Getters & Setters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}
	
	void setWidth(int width) {
		this.width = width;
	}
	
	public String toString() {
		return "X: " + x +"\nY: " + y +"\nWidth: " + width + "\nHeight: " + width;
	}
	
	
	@Override
	public void paint(Graphics g) {
		// Paint the square here
		g.setColor(Color.RED);
	    g.fillRect (x, y, width, width);
//	    g.drawRect(x, y, width, width);
	}

}
