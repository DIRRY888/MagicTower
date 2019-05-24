import java.awt.Container;
import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	public Window() {
		setTitle("Let's Rush Out");
		MyPanel panel = new MyPanel();
		Container contentPane = getContentPane();
		contentPane.add(panel);
		pack();
	}
}
