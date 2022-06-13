package com.cesar.zookeeprs;

public class Tests {
	
//	Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.

	public static void main(String[] args) {
//		Gorilla and Bat instantiation 
		GorillaMainnn Jack = new GorillaMainnn();	
		VampireBat Sky = new VampireBat();
		
		
		System.out.println("The Gorilla ... ");
		System.out.println("        ");
		Jack.throwPoop();
		System.out.println("");
		Jack.throwPoop();
		System.out.println("");
		Jack.throwPoop();
		System.out.println("");
		Jack.eatNaner();
		System.out.println("");
		Jack.eatNaner();
		System.out.println("");
		Jack.climbing();
		System.out.println("");
		Jack.displayEnergy();
		System.out.println("");
	
//		Create a BatTest class to instantiate a bat and have it attack three towns, eat two humans, and fly twice.
		
		System.out.println("The Vampire.......");
		System.out.println("");
		Sky.attackTown();
		System.out.println();
		Sky.attackTown();
		System.out.println("");
		Sky.attackTown();
		System.out.println();
		Sky.eatHumans();
		System.out.println("");
		Sky.eatHumans();
		System.out.println("");
		Sky.fly();
		System.out.println("");
		Sky.displayEnergy();
		System.out.println("");
	
	}

}
