import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class createUI implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(20);
	JTextField output = new JTextField(20);
	JButton button = new JButton("convert");
	public static void main(String[] args) {
		createUI hi = new createUI();
		hi.makeUI();

	}

	void makeUI() {

		frame.add(panel);

		panel.add(input);
		panel.add(button);
		panel.add(output);

		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
PigLatinTranslator t=new PigLatinTranslator();
String g=t.translate(input.getText());
output.setText(g);

	}
}
