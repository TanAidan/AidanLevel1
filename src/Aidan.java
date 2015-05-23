
public class Aidan {
	public static void main(String[] args) {
		
	
	//1. Instantiate some Movie objects (at least 5).
	Movie  p1= new Movie("the interview",5);
	Movie p2=new Movie("interstellar",5);
	Movie p3 =new Movie("the internship",5);
	Movie p4=new Movie("barney",100000);
	Movie p5=new Movie("22 jump street" ,0);
		//2. Use the methods in the Movie object to print the name and rating of your favorite.
		
		
		System.out.println(p4.getTitle());
		
		System.out.println(p4.getRating());
		
		//3. Instantiate a NetflixQueue.
	 NetflixQueue hi=new NetflixQueue();
		//4. Add your movies to the Netflix queue.
	 hi.addMovie(p1);
	 hi.addMovie(p2);
	 hi.addMovie(p3);
	 hi.addMovie(p4);
	 hi.addMovie(p5);
		//5. Print all the movies in your queue.
hi.printMovies();
		//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
System.out.println("the best show is"+hi.getBestMovie());
		//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
System.out.println("the second best Movie is" + hi.getMovie(1));
	}
}
