 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
int number = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select ÒCopy Image URLÓ)
Component photo = createImage("http://wintrisstech.org/i/join_the_league.png");
		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(photo);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("who is the person holding the flag");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equals("Vic Wintress")){
	JOptionPane.showMessageDialog(null, "CORRECT");
	number++;
	System.out.println(number);
}
		 
		// 8. print "INCORRECT" if the answer is wrong
else{
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
		// 9. remove the comonent from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(photo);
// 10. find another image and create it
		Component photo2 = createImage("http://robertkaplinsky.com/wp-content/uploads/2013/09/100x100_large.jpg");
		// 11. add the second image to the quiz window
quizWindow.add(photo2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String answer2 = JOptionPane.showInputDialog("where can you get this masterpiece");
		// 14+ check answer, say if correct or incorrect, etc.
if(answer2.equals("In-N-Out")){
	JOptionPane.showMessageDialog(null, "CORRECT");
	number++;
    System.out.println(number);
}
		 
		
else{
	JOptionPane.showMessageDialog(null, "INCORRECT");
	
}
JOptionPane.showMessageDialog(null, "your score is" + number);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}




