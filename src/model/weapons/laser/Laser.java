package model.weapons.laser;

import model.weapons.Weapon;

public abstract class Laser implements Weapon {
	private boolean powered;
	private System objetive;//Probablemente esto no pertenezca aqui, quizas a system
	private int energyNeeded;
	private int timeToShoot;
	private int numberOfLasers;
	private int damage;

	public Laser(int energyNeeded, int timeToShoot, int numberOfLasers, int damage) {
		this.energyNeeded = energyNeeded;
		this.timeToShoot = timeToShoot;
		this.numberOfLasers = numberOfLasers;
		this.damage = damage;
	}

	public void update() {

	}

	public void setPowered(boolean powered) {
		this.powered = powered;
	}

	public void setObjetive(System objetive) {
		this.objetive = objetive;
	}

	public int getDamage() {
		return damage;
	}

	public boolean isPowered() {
		return powered;
	}

	public System getObjetive() {
		return objetive;
	}

	public int getEnergyNeeded() {
		return energyNeeded;
	}

	public int getTimeToShoot() {
		return timeToShoot;
	}

	public int getNumberOfLasers() {
		return numberOfLasers;
	}

}
