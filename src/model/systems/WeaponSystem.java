package model.systems;

import java.util.List;

import model.weapons.Weapon;

public class WeaponSystem extends System{
	//the reason behind not doing an array is couse the order matters and not looking now to implement things cant be achieve in the game(more than 4 weapons)
	Weapon firstWeapon;
	Weapon secondWeapon;
	Weapon thirdWeapon;
	Weapon fourthWeapon;
	
	public WeaponSystem(Weapon firstWeapon,Weapon secondWeapon ,Weapon thirdWeapon,Weapon fourthWeapon) {//you can't change the weapons once you make the weapon system
		this.firstWeapon = firstWeapon;
		this.secondWeapon = secondWeapon;
		this.thirdWeapon = thirdWeapon;
		this.fourthWeapon = fourthWeapon;
	}

}
