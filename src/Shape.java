import java.awt.Graphics;

import javax.swing.JComponent;

public class Shape extends JComponent{
	
	public Shape() {
		
	}
	
	public void paint(Graphics g) {
	    g.drawRect (10, 10, 200, 200);  
	}
}
