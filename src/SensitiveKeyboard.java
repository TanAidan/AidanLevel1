import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SensitiveKeyboard {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.pack();
		frame.show();
		
		frame.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {

				try {
					Runtime.getRuntime().exec("say ouch " ).waitFor();
					System.out.println("ffasdf");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}

		);

	}
}