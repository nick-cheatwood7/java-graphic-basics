
import javax.swing.JFrame;

public class Driver {

	public static void drawSquare() {

		// Create a new Square object and see props
		Square mySquare = new Square(50, 70, 200);
		System.out.println("\nSquare:\n" + mySquare.toString());

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(10, 10, 600, 600);
		window.getContentPane().add(mySquare);
		window.setVisible(true);

	}

	public static void drawRectangle() {

		// Create a new Rectangle object and see props
		Rectangle myRectangle = new Rectangle(50, 70, 400, 100);
		System.out.println("\nRectangle:\n" + myRectangle.toString());

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(10, 10, 600, 600);
		window.getContentPane().add(myRectangle);
		window.setVisible(true);

	}

	public static void drawCircle() {

		// Create a new Circle object and see props
		Circle myCircle = new Circle(50, 50, 200);
		System.out.println("\nCircle:\n" + myCircle.toString());

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(10, 10, 600, 600);
		window.getContentPane().add(myCircle);
		window.setVisible(true);

	}

	public static void main(String[] args) {
		drawSquare();
	}

}
