
import java.awt.Color;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class TurtlePond implements KeyEventDispatcher {

	// 1. Set a location for the food
	int cookieX=0;
	int cookieY=0;

	// 2. Choose the speed you want the Tortoise to go at
	int speed=12;
	
	void setup() {
		// 3. Add an intro message to tell the user what to do
JOptionPane.showMessageDialog(null,"Move the turtle with the arrow keys to find its food.\n youll get warmer the close you get.\n\n Hurry or youll die of hunger");
		// 4. For debugging purposes, show the food
		
		
		}

	private void goUp() {
		Tortoise.move(speed);
	}

	private void goDown() {
		Tortoise.move(-speed);
	}

	private void goLeft() {
		// 5. make the tortoise move left (3 lines of code)
		Tortoise.turn(90);
		Tortoise.move(50);
		
	}

	private void goRight() {
		// 6. make the tortoise move right
		Tortoise.turn(90);
		Tortoise.move(50);
	}

	private void checkForFood() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 7. If the Tortoise is within 100 pixels of the food, set the background color to yellow
if(Tortoise.getX()-cookieX<100){
	if(Tortoise.getY()-cookieY<100){
		TurtlePanel panel=Tortoise.getBackgroundWindow();
		panel.setColor(Color.YELLOW);
	}
}

		// 8. If the Tortoise is within 50 pixels of the food, set the background color to orange
if(Tortoise.getX()-cookieX<50){
	if(Tortoise.getY()-cookieY<50){
		TurtlePanel panel=Tortoise.getBackgroundWindow();
		panel.setColor(Color.orange);
	}
}

		// 9. If the Tortoise is within 20 pixels of the food, set the background color to red
if(Tortoise.getX()-cookieX<100){
	if(Tortoise.getY()-cookieY<20){
		TurtlePanel panel=Tortoise.getBackgroundWindow();
		panel.setColor(Color.red);
	}
}

		// 10. If tortoise is within 5 pixels of the cookie, make a pop-up to tell them they found it
if(Tortoise.getX()-cookieX<5){
	if(Tortoise.getY()-cookieY<5){
		JOptionPane.showMessageDialog(null,"u found it");
		
	}
}

		// 11. If the Tortoise crosses it's own path, move them back to the beginning
		TurtlePond pond= new TurtlePond();
		if(pond.wasHereBefore(tortoiseLocationX, tortoiseLocationY)){
			pond.getFirstLocation();
		}
		
		// 12. If more than 20 seconds have elapsed, tell them the turtle died of hunger
getTimeElapsed();
	}
	
	private long getTimeElapsed() {
		 Date currentTime = new Date();
		 return (currentTime.getTime() - startTime.getTime())/1000;
	}

	void setBackgroundColor(Color color) {
		Tortoise.getBackgroundWindow().setBackground(color);
	}

	private void hideFood() {
		window.remove(component);
	}

	private void showFood() {
		// If the food doesn't show up, make sure you are on Java 1.6
		component.setLocation(cookieX, cookieY);
		window.add(component);
	}

	private boolean wasHereBefore(int xPosition, int yPosition) {
		if (previousLocations.contains(new Point(xPosition, yPosition)))
			return true;
		else
			return false;
	}

	private Point getFirstLocation() {
		return previousLocations.get(0);
	}

	/*********************** don't worry about the stuff under here ******************/

	TurtlePanel window = Tortoise.getBackgroundWindow();
	Label component = new Label("*");
	Date startTime = new Date();

	public static void main(String[] args) {
		TurtlePond feeder = new TurtlePond();
		feeder.controlTheTortoise();
		feeder.setup();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setPenColor(Colors.Purples.DarkMagenta);
		Tortoise.getBackgroundWindow().setBackground(Colors.Grays.SlateGray);
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			try {
				checkForFood();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			savePosition(Tortoise.getX(), Tortoise.getY());
		}
		return false;
	}

	ArrayList<Point> previousLocations = new ArrayList<Point>();

	private void savePosition(int xPosition, int yPosition) {
		previousLocations.add(new Point(xPosition, yPosition));
	}
}
