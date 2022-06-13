package com.cesar.bankaccount;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		account1.deposit(10.00);
		account1.deposit(10.00);
		account1.deposit(10.00);
		account1.withdrawChecking(12.00);
		account1.balance();
		
		System.out.println();
	}

}
