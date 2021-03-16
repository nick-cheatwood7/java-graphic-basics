
import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 600, 600);
		window.getContentPane().add(new Circle(10, 10, 200));
		window.setVisible(true);
	}

}
