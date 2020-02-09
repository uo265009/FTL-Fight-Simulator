package model.ship;

import java.util.ArrayList;

public abstract class Ship {
	public static final int MAX_HULL = 30;
	
	private int reactorPower;
	private int activeShieldLayers;
	private ArrayList<System> systems;
	private int numberOfMisiles;
	private int numberOfDroneParts;
	private int hull;
	
	
	public  Ship() {
		
	}
	
	
	public int getDodgeChance() {
		//TODO
		return 0;
	}

}
