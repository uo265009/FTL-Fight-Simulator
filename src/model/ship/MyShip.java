package model.ship;

import java.util.ArrayList;

import model.systems.System_FTL;

public class MyShip extends Ship {
	
	public MyShip(int reactorPower, ArrayList<System_FTL> systems, int numberOfMisiles, int numberOfDroneParts) {
		super(reactorPower,  systems, numberOfMisiles, numberOfDroneParts);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	

}
