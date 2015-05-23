
public class hi {
public static void main(String[] args) {
	
	hi h= new hi();
	
System.out.println(h.echo("what up", 3));
}
public String echo(String word, int times){
	String output= "";
	for (int i = 0; i < times; i++) {
	output+=word;
	}
	
	return output;
	
}
}