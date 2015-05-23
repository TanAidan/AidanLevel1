import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JokesButton implements ActionListener{
	public static void main(String[] args) {

		JokesButton hd = new JokesButton();
		hd.MakeButton();
	}

	void MakeButton() {
		JOptionPane.showMessageDialog(null, "i beat the static");
		JButton joke = new JButton("joke");
		JButton punchline = new JButton("punchline");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		frame.show();
	
	joke.addActionListener(this);
	punchline.addActionListener(this);
	
	if()
	}
}
