public class Person {

	private String name;
	private String superpower;

	public String getName() {
		return name;

	}

	public void setName(String newName) {
		name = newName;
	}

	public String getSuperpower() {
		return superpower;

	}

	public void setSuperpower(String newSuperpower) {
		superpower = newSuperpower;
	}

	public String toString() {
		return name + "has" + superpower;

	}
}
