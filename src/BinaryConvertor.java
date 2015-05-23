import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConvertor implements ActionListener {
	 JButton convert;
	public void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);

		frame.setVisible(true);
		JTextField input = new JTextField(20);

		 convert = new JButton("convert");

		JTextField output = new JTextField(20);

		panel.add(input);
		panel.add(convert);
		panel.add(output);
		frame.pack();

		convert.addActionListener(this);
		
	}

	public static void main(String[] args) {
		BinaryConvertor convertor= new BinaryConvertor();
		convertor.createUI();

	}

	String convert(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		 char theLetter = (char) asciiValue;
		return "" + asciiValue;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		// TODO Auto-generated method stub
		if(convert==arg0.getSource())
		{
			int asciiValue = 0;
			System.out.println(asciiValue);
			
		}
	}
}
