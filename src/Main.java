import javax.swing.JOptionPane;

public class Main {
	static int choice;
	static String[] options = { "smoke", "sail", "jump"};

	public static void main(String[] args) {
		new Main().getGoing();
	}

	private void getGoing() {
		choice = JOptionPane.showOptionDialog(null, "sail or smoke or jump?",
				"Choose an option", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		if (choice == 0) {
			System.out.println("sail");
		}
		if (choice == 1) {
			System.out.println("smoke");
		}
		if (choice == 2) {
			System.out.println("jump");
		}
	}
}

/*
 * Object[] options = { "OK", "Cancel" }; int choice =
 * JOptionPane.showOptionDialog(null, "You really want to quit?", "Quit?",
 * JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
 * options[0]);
 */
