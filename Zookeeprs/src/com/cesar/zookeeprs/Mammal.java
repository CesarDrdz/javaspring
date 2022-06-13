package com.cesar.zookeeprs;

public class Mammal {
//	The.. Member Variables
	private int energyLevel;
//	constructor 
	public Mammal(){
		this.energyLevel= 300;
	}
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
//	method(s)
	public int displayEnergy(){
		System.out.println("Creepy voice from above.... Energy is now " + this.getEnergyLevel());
		return this.getEnergyLevel();
	}
	
//	getters and setters
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
