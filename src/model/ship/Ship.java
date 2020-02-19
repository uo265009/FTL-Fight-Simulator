package model.ship;

import java.util.ArrayList;

import log.Observer;
import model.systems.System_FTL;

public abstract class Ship implements Observer{
	public static final int MAX_HULL = 30;
	
	private int reactorPower;
	private int activeShieldLayers;
	private ArrayList<System_FTL> systems;
	private int numberOfMisiles;
	private int numberOfDroneParts;
	private int hull;
	
	private Ship targetShip;
		
	

	
	public Ship(int reactorPower, ArrayList<System_FTL> systems, int numberOfMisiles, int numberOfDroneParts) {
		this.reactorPower = reactorPower;
		this.systems = systems;
		this.numberOfMisiles = numberOfMisiles;
		this.numberOfDroneParts = numberOfDroneParts;
		hull = MAX_HULL;
	}
	
	
	
	
	public void receiveShoot() {
		//Dodge chances and that stuff TODO
		
		
	}


	private void setReactorPower(int reactorPower) {
		this.reactorPower = reactorPower;
	}


	private void setActiveShieldLayers(int activeShieldLayers) {
		this.activeShieldLayers = activeShieldLayers;
	}


	private void setSystems(ArrayList<System_FTL> systems) {
		this.systems = systems;
	}


	private void setNumberOfMisiles(int numberOfMisiles) {
		this.numberOfMisiles = numberOfMisiles;
	}


	private void setNumberOfDroneParts(int numberOfDroneParts) {
		this.numberOfDroneParts = numberOfDroneParts;
	}


	private void setHull(int hull) {
		this.hull = hull;
	}


	public int getReactorPower() {
		return reactorPower;
	}


	public int getActiveShieldLayers() {
		return activeShieldLayers;
	}


	public ArrayList<System_FTL> getSystems() {
		return systems;
	}


	public int getNumberOfMisiles() {
		return numberOfMisiles;
	}


	public int getNumberOfDroneParts() {
		return numberOfDroneParts;
	}


	public int getHull() {
		return hull;
	}


	public int getDodgeChance() {
		//TODO
		return 0;
	}
	

}
