package com.cesar.zookeeprs;

public class VampireBat extends Mammal{
	
//VAR Members
	
//	Constructor
	public VampireBat(){
		super(300);
	}
	
//	Methods
	public int fly(){
		System.out.println("");
		this.setEnergyLevel(getEnergyLevel() - 30 );
		System.out.println("Creepy voice from above.... Energy update " + this.getEnergyLevel());
		return this.getEnergyLevel();
	}
	
	public int eatHumans(){
		System.out.println("Ahhhh, I'm being eaten...Help me!!");
		this.setEnergyLevel(getEnergyLevel() + 50);
		System.out.println("Creepy voice from above.... Energy update " + this.getEnergyLevel());
		return this.displayEnergy();
	}
	
	public int attackTown(){
		System.out.println("NOOOO!!! They've come to eat us all!!!");
		this.setEnergyLevel(getEnergyLevel()- 100);
		System.out.println("Creepy voice from above.... Energy update " + this.getEnergyLevel());
		return this.getEnergyLevel();
		
	}
}
