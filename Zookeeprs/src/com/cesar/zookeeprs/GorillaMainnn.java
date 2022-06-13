package com.cesar.zookeeprs;

public class GorillaMainnn  extends Mammal{
//	added VAR Members
//	added constructors
	
//	methods
	public int throwPoop(){ 
		System.out.println("The Gorilla is throwing Poop!!");
		this.setEnergyLevel(getEnergyLevel() -10);
		System.out.println("Creepy voice from above.... Energy update " + this.getEnergyLevel());
		return this.getEnergyLevel();
	}
	
	public int eatNaner(){
		System.out.println("Gorilla is eating...MMMM Naner");
		this.setEnergyLevel(getEnergyLevel() +20);
		System.out.println("Creepy voice from above.... Energy update " + this.getEnergyLevel());
		return this.getEnergyLevel();
	}
	
	public int climbing(){
		System.out.println("The Gorilla is Climbing.. Look at em go");
		this.setEnergyLevel(getEnergyLevel() -30);
		System.out.println("Creepy voice from above.... Energy update " + this.getEnergyLevel());
		return this.getEnergyLevel();
	}
	


}
