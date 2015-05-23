import javax.swing.JOptionPane;

public class methods {
	public static void main(String[] args) {

		iRock("aidan");
		truth("RYAN NAGLE");
	}

	public static void iRock(String d) {
		System.out.println(d + " rocks");
	}

	public static void truth(String hi) {
		if (hi.equals("Aidan")) {
			System.out.println("Aidan is awesome");
		} else {
			System.out.println(hi + ", you are a total waste of a geek");
		}
	}
}