package log;

import model.ship.Ship;

/**
 * In this class hapends all of the things that happens in a batle
 */
public class Game {
	Ship shipA;
	Ship shipB;
	VirtualClock clock;
	
	public Game(Ship shipA, Ship shipB) {
		this.shipA = shipA;
		this.shipB = shipB;
	}

}
