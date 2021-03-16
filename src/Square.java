
import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {

	private int width;
	private int height;
	private Square bounds;

	public Square(int x, int y, int width) {
		super(x, y);
		// constructor
		this.width = width;
		this.height = width;
	}

	// Getters & Setters
	public int getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}

	public Square getBoundedSquare() {
		return new Square(super.getX(), super.getY(), this.width);
	}

	public String toString() {
		return "X: " + super.getX() + "\nY: " + super.getY() + "\nWidth: " + width + "\nHeight: " + height;
	}

	@Override
	public void paint(Graphics g) {
		// Paint the square here
		g.setColor(Color.RED);
		g.fillRect(super.getX(), super.getY(), width, height);
	}

}
