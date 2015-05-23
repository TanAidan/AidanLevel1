// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

    JLabel drumImage;
    JLabel drumImage1;
    JLabel drumImage2;
    JLabel drumImage3;
    
    JLabel drumImage4;
    public static void main(String[] args) throws Exception {
   	 new DrumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   	 JFrame frame = new JFrame();
   	 // 2. Make the frame visible
   	 frame.setVisible(true);
   	 // 3. Set the size of the frame
   	 frame.setSize(1000, 1000);
   
   	 // 4. Set the title of the frame
   	 frame.setTitle("Drum Kit");
   	 // 5. Make a JPanel and initialize it.
   	JPanel panel  = new JPanel();
   	 // 6. Add the panel to the frame. (The panel is invisible.)
    frame.add(panel);
    
   	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
    
   	 // 8. Put the name of your image in a String variable.
    String drum = "images-1.jpg";
    String drum1 = "images-2.jpg";
    String drum2 = "images-3.jpg";
    String drum3 = "images-4.jpg";
    String drum4 = "images-5.jpg";
   	 // 9. Use the "createImage()" method to initialize the drumImage variable.
   	  drumImage= createImage(drum);
   	drumImage1= createImage(drum1);
 	drumImage2= createImage(drum2);
	drumImage3= createImage(drum3);
	drumImage4= createImage(drum4);
   	 // 10. Add the ;image to the panel
   panel.add(drumImage);
   panel.add(drumImage1);
 panel.add(drumImage2);
 panel.add(drumImage3);
 panel.add(drumImage4);
   	 // 11. Set the layout of the panel to "new GridLayout()"
    panel.setLayout(new GridLayout());
   	 // 12. call the pack() method on the frame
   frame.pack();
   	 // 13. add a mouse listener to your drumImage.
drumImage.addMouseListener(this);
drumImage1.addMouseListener(this);
drumImage2.addMouseListener(this);
drumImage3.addMouseListener(this);
drumImage4.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
   	 // 14. When the mouse is clicked, print "mouse clicked"
System.out.println("mouse clicked");
   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound from freesound.org and drop it into your "default package"
   	 
   	 // 16. If they clicked on the drumImage...
if(drumImage==drumClicked)
{
playSound("DrumSound.wav");	
}
if(drumImage1==drumClicked)
{
playSound("40106__yewbic__ubpunch11-175bpm.wav");	
}
if(drumImage2==drumClicked)
{
playSound("HardCoreDrums.wav");	
}
if(drumImage3==drumClicked)
{
	System.out.println("sdsds");
playSound("106542__gunnbladez__90-tr808-phat-drums-02.wav");	
}
if(drumImage4==drumClicked)
{
playSound("190613__goup-1__drums.wav");	
}

   		 // 17. ...use the playSound method to play a drum sound.

   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createImage(String fileName) throws MalformedURLException {
   	 URL imageURL = getClass().getResource(fileName);
   	 Icon icon = new ImageIcon(imageURL);
   	 JLabel imageLabel = new JLabel(icon);
   	 return imageLabel;
    }

    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}