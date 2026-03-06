package com.bank.app;

import java.util.Scanner;

public class Main {
	static int age;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        Bank[] accounts = new Bank[10];
        int count =0;
        
        int choice;
        System.out.print(age);
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
                
                int index = findAccount(accounts , count , enteredAccountNo);
                
                if(index!=-1) {
                
                	System.out.println("Enter deposit amount:");
                    double dep = sc.nextDouble();
                    
                    accounts[index].deposit(dep);
                    
                    break;
                } else {
                	
                	System.out.println("Account Not Found");
                }
                
                break;

            case 3:
            	
            	System.out.println("Enter the Account Number:");
                int enteredAccountNo2 = sc.nextInt();

                int index2 = findAccount(accounts, count, enteredAccountNo2);

                if(index2 != -1) {

                    System.out.println("Enter withdrawal amount:");
                    double wit = sc.nextDouble();

                    accounts[index2].withdraw(wit);

                } else {

                    System.out.println("Account not found!");

                }

                break;

            case 4:
            	System.out.println("Enter the Account Number:");
                int enteredAccountNo3 = sc.nextInt();

                int index3 = findAccount(accounts, count, enteredAccountNo3);

                if(index3 != -1) {

                    accounts[index3].displayBalance();

                } else {

                    System.out.println("Account not found!");

                }

                break;

            case 5:


                System.out.println("Enter the Account Number:");
                int enteredAccountNo4 = sc.nextInt();

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
	
	public static int findAccount(Bank[] accounts, int count,int accNo) {
		
		for(int i=0;i<count;i++) {
			
			if(accounts[i].getAccountNumber()==accNo) {
				return i;
			}
		}
		return -1;
	}
}
