package observers;

/**
 * Observer that prints the game's world (the map with all the treasures,
 * heroes, obstacles)
 *
 */

import game.World;

import java.util.Observable;
import java.util.Observer;

public class WorldPrinter implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO obtain the World's map, treasures and heroes
		// print the map
		// e.g.
		// 0  1  1  1  0  
		// H  T  0  1  0  
		// 0  0  T  0  0  
		// 0  0  0  T  T  
		// 0  T  0  0  0  
		// T - treasure, H - hero, 1 - obstacle
		int [][]map= World.getInstance().getMap();
		for(int i=0;i<World.MAP_SIZE;i++)
			for(int j=0;j<World.MAP_SIZE;j++)
				switch (map[i][j]){
					case World.HERO_SPOT:
						System.out.print(" H ");
						break;
						case World.TREASURE_SPOT:
							System.out.print(" T ");
							break;
					default:
						System.out.print(" "+map[i][j]+" ");
				}
	}
	
}