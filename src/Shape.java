import java.awt.Graphics;

import javax.swing.JComponent;

public class Shape extends JComponent {

	private int x;
	private int y;

	public Shape(int x, int y) {
		// create a new Shape ofbject at point (x,y)
		this.x = x;
		this.y = y;
	}

	// Getters & Setters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void paint(Graphics g) {
		g.drawRect(10, 10, 200, 200);
	}
}
