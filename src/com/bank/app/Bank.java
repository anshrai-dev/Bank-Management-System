package com.bank.app;

public class Bank {
	private String accountHolderName;
	private int accountNumber;
	private double balance;
	
	static String bankName = "State Bank";
	
	public Bank(String accountHolderName, int accountNumber , double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Amount is deposited Successfully!");
		}else {
			System.out.println("Invalid Amount!");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("You have successfully withdrawn"+amount);
		}else {
			System.out.println("Your Account balance is not sufficient");
		}
	}
	
	public void displayBalance() {
		System.out.println("Current Balance:" +balance);
	}
	
	public void displayAccountDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}
