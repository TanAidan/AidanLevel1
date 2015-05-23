import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtons implements ActionListener {
	
	public static void main(String[] args) {
		new DuellingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		// 1. Add the panel to the frame 
		frame.add(panel);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		leftButton.setText("CLICK ME");
		// 4. Set the text of the rightButton to "Click me!"
		rightButton.setText("CLICK ME");
		// 5. Add an action listener to the leftButton
         leftButton.addActionListener(this);
		// 6. Add an action listener to the rightButton
         rightButton.addActionListener(this);
		// 7. Add the leftButton to the panel
panel.add(leftButton);
		// 8. Add the rightButton to the panel
panel.add(rightButton);
		// 9. Pack the frame
frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
frame.setTitle("demanding buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		
		/* If the buttonPressed was the leftButton....*/
			// Set the text of the rightButton to 
		if(buttonPressed==leftButton)
		{
			rightButton.setText("No, click Me!");
			rightButton.setPreferredSize(BIG);
			leftButton.setText("Click Me!");
			leftButton.setPreferredSize(SMALL);
		}
			// Set the preferred size of the rightButton to BIG
			// Set the text of the leftButton to 
			// Set the preferred size of the leftButton to SMALL
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */
		if(buttonPressed==rightButton)
		{
			leftButton.setText("No, click Me!");
			leftButton.setPreferredSize(BIG);
			rightButton.setText("Click Me!");
			rightButton.setPreferredSize(SMALL);
		}

		frame.pack();
	}
}
