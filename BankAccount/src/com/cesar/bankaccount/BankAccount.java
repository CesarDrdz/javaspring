package com.cesar.bankaccount;

public class BankAccount {
	// 
	private double checkingBalance = 0.0;
	private double savingsBalnace = 0.0;
	
	private static int numOfAccounts = 0;
	private static double total = 0.0;
	private static double balance =0.0;
	
	
	public BankAccount() {
		total++;
	}
	
//	methods
	public double balance(){
		return this.getCheckingBalance()+ this.getSavingsBalnace();
		
	}
	
	
	
	
	public void deposit(double amount){
		
		checkingBalance += amount;
		total =+ amount;
	}
	public void withdrawChecking(double amount) {
		if (amount > this.getCheckingBalance()) {
			System.out.println("not enough monies");
		}else {
//			change the checking balance with getters and setters
			this.setCheckingBalance(this.getCheckingBalance() - amount );
			total -= amount;
			System.out.println("this is your balance" + this.getCheckingBalance());
		}
	
		
			
		}
		
		

		
	
	
	
	

//getters and setters
	public double getCheckingBalance() {
		return checkingBalance;
	}


	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}


	public double getSavingsBalnace() {
		return savingsBalnace;
	}


	public void setSavingsBalnace(double savingsBalnace) {
		this.savingsBalnace = savingsBalnace;
	}


	public static int getNumOfAccounts() {
		return numOfAccounts;
	}


	public static void setNumOfAccounts(int numOfAccounts) {
		BankAccount.numOfAccounts = numOfAccounts;
	}


	public static double getTotal() {
		return total;
	}


	public static void setTotal(double total) {
		BankAccount.total = total;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		BankAccount.balance = balance;
	}

//	public char[] balance() {
//		// TODO Auto-generated method stub
//		return balance;
//	}
}
