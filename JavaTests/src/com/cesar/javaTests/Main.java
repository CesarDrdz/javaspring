package com.cesar.javaTests;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		miles driven by salesRep
		double milesDriven = 1000d;
		int customers = 50;
		String lastKey = "d"; // lastKeyPressed by player
//		make things clear naming should be understandable..
		double kilometers = (100d * 1.603944d);
//		examples of statements 
		int finalScore = 50;
//		expressionStatement just need semicolons;
		System.out.println(finalScore + customers);
		int playersHighScore;
//		expression statements 
		int calculatedScore = finalScore = 60;
		System.out.println("Calculated Score = " + calculatedScore);

		finalScore = 70;

//		using ++ -- etc.
		int playersLives = 3;
		System.out.println("lives remaining " + playersLives--);
		System.out.println("lives is now " + playersLives);
		System.out.println("Lives are " + --playersLives);
//		messing with prefix and post fix operators either running and changing values before or after the output
		System.out.println("lives remining = " + playersLives++);
		System.out.println("lives is now " + playersLives);
		System.out.println("and adding 1 live(s)" + ++playersLives);

//		player lives are now 3 lets do some short hand
		playersLives++;
		System.out.println("lives remaining " + playersLives);
//		playersLives--;
//		System.out.println("lives remaining " + playersLives);
//		playersLives--;
//		System.out.println("lives remaining " + playersLives);
//		playersLives++;
//		System.out.println("lives remaining " + playersLives);
//		
//		if else then etc.... controlFlowStatments 
		if (calculatedScore > 59) {
			System.out.println("i calculate your score is more than 59!");

//			white spaces are important don't forget to make your code more readable  
//			however java does not care about lines unless ended prematurely..
//			System.out.println("This is a nice chunk of text!!");
//			just write the code the way you're taught....these are just examples 
			int planesDestroyed = 50;
			planesDestroyed--;
			System.out.println("planes Destroyed =" + planesDestroyed);

//			code blocks in the left and right of the curly braces{}
//			indentation to make it easy for humans to read 
			
			int score =2000;
			int finalScoreLevel =4;
			if (score >5000) {
				System.out.println("you got the high score");
			}else {
				System.out.println("next time buddy");
			}
			
//			boolean variables (bool) 
			boolean isGameOver = true;
			int levelCompleted=5;
			int bonus = 100;
			
			if(isGameOver == true) {
				int finalScoreLevel1 = score + (levelCompleted * bonus);
				System.out.println("your final score was" + finalScoreLevel1);
			}
			
			
				
			}
			

		}



	}


