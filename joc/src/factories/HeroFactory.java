package factories;

import entities.*;


public class HeroFactory {
	//TODO implement me

	/**
	 *
	 * @param type the Hero type
	 * @param name
	 * @return
	 */
	public Hero createHero(Hero.Type type, String name) {
		switch (type){
			case MAGE :
				return new Mage(name);
			case PRIEST:
				return new Priest(name);
			case WARRIOR:
				return new Warrior(name);
			default:
				return null;
		}


	}
}
