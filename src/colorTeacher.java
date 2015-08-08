import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class colorTeacher implements ActionListener {
	JFrame frame = new JFrame("Color Teacher");
	JPanel panel = new JPanel();
	JButton button4 = new JButton();
	JButton button3 = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {
		colorTeacher color = new colorTeacher();
		color.createUI();

	}

	public void createUI() {
		
		
		button1.setBackground(Color.yellow);
		button1.setOpaque(true);
		
		button2.setBackground(Color.red);
		button2.setOpaque(true);
		
		button3.setBackground(Color.BLUE);
		button3.setOpaque(true);
		
		button4.setBackground(Color.green);
		button4.setOpaque(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
			if(buttonPressed==button1){
				speak("yellow");
			}
			else if(buttonPressed==button2)
			{
				speak("red");
			}
			else if(buttonPressed==button3)
			{
				speak("blue");
				
			}
			else if(buttonPressed==button4)
			{
				speak("green");
			}
		
		
	}
	void speak(String words)
	{
		try
		{
			Runtime.getRuntime().exec("say "+ words);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
