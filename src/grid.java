import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;


public class grid {
	public static void main(String[] args) {
		World w = new World();
		w.show();
		//Bug b=new Bug();
		Flower fo= new Flower();
	//	Flower ff= new Flower();
		Color c= new Color(100, 200, 150);
//b.setColor( c);
Random rand= new Random();
//int  n = rand.nextInt(10) + 0;

//int  f = rand.nextInt(10) + 0;
	
	//b.turn();
	//b.turn();
	//w.add(new Location(n,f+1),fo);
	//w.add(new Location(n,f-1),ff);
	for (int i = 0; i <10; i++) {
	
		
		for (int j = 0; j < 10; j++) {
				Location l=new Location(j, i);
				w.add(l,fo);
		}
	}
}
}