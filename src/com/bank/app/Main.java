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
            
            switch(choice) {

            case 1:
            	if(count<accounts.length) {
            		System.out.println("Enter the Account Holders Name:");
            		String name = sc.nextLine();
            		
            		System.out.println("Enter Account Number:");
                    int accNo = sc.nextInt();

                    System.out.println("Enter Initial Balance:");
                    double balance = sc.nextDouble();
                    
                    Bank account = new Bank(name , accNo , balance);
                    accounts[count]=account;
                    count++;
                    
                    System.out.println("Account created successfully!");
                    break;
            	}else {
            		System.out.println("bank account limit is reached");
            		break;
            	}
            	
            case 2:
                System.out.println("Enter the Account Number:");
                int enteredAccountNo = sc.nextInt();
                for(int i=0;i<count;i++) {
                	if(accounts[i].getAccountNumber() ==enteredAccountNo) {
                		System.out.println("Enter deposit amount:");
                        double dep = sc.nextDouble();
                        accounts[i].deposit(dep);
                        break;
                	}
                }
                break;

            case 3:
            	System.out.println("Enter the Account Number:");
            	int enteredAccountNo2 = sc.nextInt();
            	for(int i=0;i<count;i++) {
            		if(accounts[i].getAccountNumber()==enteredAccountNo2) {
            			System.out.println("Enter withdrawal amount:");
                        double wit = sc.nextDouble();
                        accounts[i].withdraw(wit);
                        System.out.println("Withdrawl Successful");
                        break;
            		}
            	}
            	break;
                

            case 4:
            	System.out.println("Enter the Account Number:");
            	int enteredAccountNo3 = sc.nextInt();
            	for(int i=0;i<count;i++) {
            		if(accounts[i].getAccountNumber()==enteredAccountNo3) {
            			accounts[i].displayBalance();		
            		}
            	}
                break;

            case 5:
            	System.out.println("Enter the Account Number:");
            	int enteredAccountNo4 = sc.nextInt();
            	for(int i=0;i<count;i++) {
            		if(accounts[i].getAccountNumber()==enteredAccountNo4) {
            			accounts[i].displayAccountDetails();		
            		}
            	}
                break;

            case 6:
                System.out.println("Thank you for using the system.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
       } while(choice!=6);
        
        sc.close();
	
	}
}
