package com.bank.app;

public class Bank {
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	
	static String bankName = "State Bank";
	
	public Bank(String accountHolderName, String accountNumber , double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void deposit(double amount) {
	    if(amount > 0) {
	        balance += amount;
	    } else {
	        System.out.println("Invalid Amount!");
	    }
	}
	
	public double getBalance() {
	    return balance;
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("You have successfully withdrawn " +amount);
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
