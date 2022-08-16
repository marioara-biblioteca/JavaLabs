package observers;

import entities.Hero;
import entities.Treasure;
import game.World;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Observer that prints the lore of a treasure when a hero discovers it.
 *
 */
public class TreasureDiscoverer implements Observer {

		
	public void update(Observable o, Object arg) {
		// TODO
		// check if any hero is in an area containing a treasure
		// print some message
		// remove treasure from map and 
		// add to specific hero's inventory		
		World world=World.getInstance();

		for(Hero h:world.getParty())
			for(Treasure t:world.getTreasures()){
				if(h.getPosx()==t.getPosx()&&h.getPosy()==t.getPosy()){
					System.out.println(h.toString()+" found "+t.toString());
					h.collect(t);
					world.removeTreasure(t);

				}
			}

	}
}
