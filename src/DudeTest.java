import static org.junit.Assert.*;
import org.junit.Test;

/**
 * To make these tests pass, you will need to create a Dude class with member
 * variables: private String name; private int age;
 * 
 * You may use Eclipse quick-fixes to help you auto-generate the class.
 * **/

public class DudeTest {
	public static void main(String[] args) {

		dinosaur vic = new dinosaur("aidan", 1300);
		assertEquals("aidan", vic.getspecies());
		assertEquals(1300, vic.getyear());
	}

}
