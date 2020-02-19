package main;

import java.util.ArrayList;

import model.ship.MyShip;
import model.systems.System_FTL;
import model.systems.WeaponSystem;
import model.weapons.Weapon;
import model.weapons.laser.Burst_Laser_MK_II;

public class MainShip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainShip().run();
	}

	private void run() {
		ArrayList<System_FTL> sys = new ArrayList<System_FTL>();
		Weapon myLaser = new Burst_Laser_MK_II();
		WeaponSystem wp = new WeaponSystem(myLaser, null, null, null);
		sys.add(wp);
		MyShip shooterShip = new MyShip(10,sys,10, 10);		
		MyShip targetShip = new MyShip(10,null,10, 10);
		
	}
}
