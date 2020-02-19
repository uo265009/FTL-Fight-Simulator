package log;

import model.ship.Ship;

public class EventWeapon extends Event{
	
	private Ship targetShip;
	private Ship ownShip;

	public EventWeapon(int timeTrigger) {
		super(timeTrigger);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

}
