package com.bank.app;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        Bank[] accounts = new Bank[10];
        int count =0;
        
        int choice;
        do {
        	System.out.println("\\n1. Create Account");
        	System.out.println("2. Deposit");
        	System.out.println("3. Withdraw");
        	System.out.println("4. Check Balance");
        	System.out.println("5. Account Details");
        	System.out.println("6. Exit");
        	
        	System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            
            if(!isValidChoice(choice)) {
                System.out.println("Invalid choice! Please select between 1 and 6.");
                continue;
            }
            
            switch(choice) {

           
            case 1:
                if(count < accounts.length) {

                    System.out.println("Enter the Account Holder's Name:");
                    String name = sc.nextLine();

                    String accNo;

                    while(true) {

                        System.out.println("Enter 10-digit Account Number:");
                        accNo = sc.nextLine();

                        if(!isValidAccountNumber(accNo)) {
                            System.out.println("Invalid Account Number! It must be 10 digits.");
                            continue;
                        }

                        if(findAccount(accounts, count, accNo) != -1) {
                            System.out.println("Account number already exists! Try another.");
                            continue;
                        }

                        break;
                    }

                    System.out.println("Enter Initial Balance:");
                    double balance = sc.nextDouble();

                    Bank account = new Bank(name, accNo, balance);

                    accounts[count] = account;
                    count++;

                    System.out.println("Account created successfully!");
                    break;

                } else {

                    System.out.println("Bank account limit is reached");
                    

                }   break;         	
            case 2:
                System.out.println("Enter the Account Number:");
                String enteredAccountNo = sc.nextLine();
                
                int index = findAccount(accounts , count , enteredAccountNo);
                
                if(index!=-1) {
                
                	System.out.println("Enter deposit amount:");
                	double dep = sc.nextDouble();

                	if(isValidDeposit(dep)) {
                	    accounts[index].deposit(dep);
                	    System.out.println("₹" + dep + " deposited successfully!");
                	} else {
                	    System.out.println("Invalid deposit amount!");
                	}
                   
                    break;
                
                } else {
                	
                	System.out.println("Account Not Found");
                }
                
                break;

            case 3:
            	
            	System.out.println("Enter the Account Number:");
                String enteredAccountNo2 = sc.nextLine();

                int index2 = findAccount(accounts, count, enteredAccountNo2);

                if(index2 != -1) {

                    System.out.println("Enter withdrawal amount:");
                    double wit = sc.nextDouble();

                    if(isValidWithdraw(wit, accounts[index2].getBalance())) {
                        accounts[index2].withdraw(wit);
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Invalid amount or insufficient balance!");
                    }

                } else {

                    System.out.println("Account not found!");

                }

                break;

            case 4:
            	System.out.println("Enter the Account Number:");
                String enteredAccountNo3 = sc.nextLine();

                int index3 = findAccount(accounts, count, enteredAccountNo3);

                if(index3 != -1) {

                    accounts[index3].displayBalance();

                } else {

                    System.out.println("Account not found!");

                }

                break;

            case 5:


                System.out.println("Enter the Account Number:");
                String enteredAccountNo4 = sc.nextLine();

                int index4 = findAccount(accounts, count, enteredAccountNo4);

                if(index4 != -1) {

                    accounts[index4].displayAccountDetails();

                } else {

                    System.out.println("Account not found!");

                }

                break;

            case 6:
                
            	System.out.println("Thank you for using the system.");
                break;

            default:
                
            	System.out.println("Invalid choice.");
        }
       
        }  while(choice!=6);
        
        sc.close();
	
	}
	
	public static int findAccount(Bank[] accounts, int count,String accNo) {
		
		for(int i=0;i<count;i++) {
			
			if(accounts[i].getAccountNumber().equals(accNo)) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean isValidAccountNumber(String accNo) {
	    return accNo.length() == 10;
	}
	
	public static boolean isValidDeposit(double amount) {
	    return amount > 0;
	}
	
	public static boolean isValidWithdraw(double amount, double balance) {
	    return amount > 0 && amount <= balance;
	}
	
	public static boolean isValidChoice(int choice) {
	    return choice >= 1 && choice <= 6;
	}
	
	
}
