
public class yummy {
public static void main(String[] args) {
	Microwave microwave= new Microwave();
	Popcorn popcorn= new Popcorn("maple bacon");
	popcorn.applyHeat();
	microwave.putInMicrowave(popcorn);
	microwave.setTime(10);
	microwave.startMicrowave();
}
}
