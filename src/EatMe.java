import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.HashMap;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * This game uses the Makey Makey to see if you can match the pictures of food
 * to the correct utensil. There are utensils (including metal chopsticks!) in
 * one of the blue drawers.
 * 
 * Learn how to hook up the Makey Makey here: http://makeymakey.com/howto.php
 * 
 */

public class EatMe extends KeyAdapter {

	private JFrame jFrame = new JFrame();
	private HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int correctUtensilCode;

	private void makeAlbum() {
		// 1. Find 4 images of foods eaten by different utensils and put them in
		// your default package.

		// 2. Connect the images to the UP, DOWN, LEFT, and RIGHT keys like
		// this...
		images.put(new Integer(KeyEvent.VK_UP), "imgres-5.jpg"); // the spoon
																	// will be
																	// connected
																	// to UP
		 images.put(new Integer(KeyEvent.VK_DOWN), "imgres-6.jpg");

		 images.put(new Integer(KeyEvent.VK_LEFT), "imgres-7.jpg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "IMG_9377.jpg");
		// 3. Call the method to show an image.
		showImage();
	}

	public void keyPressed(KeyEvent e) {

		int whichKeyPressed = e.getKeyCode();

		// 9. Print out the key that was pressed (syso)
		System.out.println(whichKeyPressed);
		// 10. Print the correctUtensilCode
		System.out.println(correctUtensilCode);
		// 11. If they match, tell the user they were correct
		if (correctUtensilCode == whichKeyPressed) {
			System.out.println("you are correct");

			// 12. Otherwise, tell them user they should learn some manners
			
		}
		else{
			System.out.println("wrong");
		}
		// 13. Hook up the utensils to the Makey Makey and test if it works

		jFrame.dispatchEvent(new WindowEvent(jFrame, WindowEvent.WINDOW_CLOSING)); // closes
																					// the
																					// JFrame
		// 14. Call the method to show an image
		showImage();
		// 15. Make a variable for the number of tries and limit it to 10.
		// [requires code in different places]
		int tries;
		// 16. Make a variable to track the score and tell the user at the end.
		// [requires code in different places]
	}

	int score;

	private void showImage() {
		jFrame.add(getNextRandomImage());
		// 5. Set the JFrame to visible (The JFrame already exists.)
		jFrame.setVisible(true);
		// 6. Pack the JFrame
		jFrame.pack();
		// 7. Add a key listener to the JFrame
		jFrame.addKeyListener(this);
	}

	private Component getNextRandomImage() {
		String[] fileNames = images.values().toArray(new String[0]);
		int randomness = new Random().nextInt(fileNames.length);
		String randomFile = fileNames[randomness];
		System.out.println("loading image " + randomness + ": " + randomFile);
		this.correctUtensilCode = getHashMapKey(randomFile);
		return loadImage(randomFile);
	}

	private Integer getHashMapKey(String randomFile) {
		for (Integer key : images.keySet()) {
			if (images.get(key).equals(randomFile)) {
				return key;
			}
		}
		return null;
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) throws Exception {
		new EatMe().makeAlbum();
	}
}

/**
 * 17. [Optional] Add a timer.
 * 
 * ~~~ where the code starts running ~~~
 * 
 * Date timeAtStart = new Date();
 * 
 * ~~~ where the code ends ~~~
 * 
 * <code>
 * Date timeAtEnd = new Date(); 
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000); 
 * System.exit(0);
 * </code>
 * 
 **/

