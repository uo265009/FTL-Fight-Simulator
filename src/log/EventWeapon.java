package log;

import model.ship.Ship;
import model.weapons.Weapon;

public class EventWeapon extends Event{	
	

	private Ship enemyShip;
	private Weapon theWeapon;
	
	public EventWeapon(int timeTrigger, Ship enemyShip, Weapon theWeapon) {
		super(timeTrigger);
		attach(theWeapon);
		attach(enemyShip);
		this.enemyShip = enemyShip;
		this.theWeapon = theWeapon;
	}

	@Override
	public void action() {
		System.out.println("Pium pium");
		notifyObservers();
		enemyShip.receiveShoot();
		
	}

}
