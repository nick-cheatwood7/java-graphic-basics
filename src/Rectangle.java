import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Square {

	private int length;

	public Rectangle(int x, int y, int width, int length) {
		// constructor
		super(x, y, width);
		this.length = length;
	}

	public String toString() {
		return "X: " + super.getX() + "\nY: " + super.getY() + "\nWidth: " + super.getWidth() + "\nLength: " + length;
	}

	@Override
	public void paint(Graphics g) {
		// Paint the rectangle
		g.setColor(Color.BLUE);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), length);
	}

}
