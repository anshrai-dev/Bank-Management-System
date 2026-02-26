package com.bank.app;


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Account Holders Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();
        
        Bank bankingDetails = new Bank(name , accNo , balance);
        
        
        int choice;
        
        do {
        	System.out.println("\\n1. Deposit");
        	System.out.println("2. Withdraw");
        	System.out.println("3. Check Balance");
        	System.out.println("4. Account Details");
        	System.out.println("5. Exit");
        	
        	System.out.println("Enter your choice:");
            choice = sc.nextInt();
            
            switch(choice) {

            case 1:
                System.out.println("Enter deposit amount:");
                double dep = sc.nextDouble();
                bankingDetails.deposit(dep);
                break;

            case 2:
                System.out.println("Enter withdrawal amount:");
                double wit = sc.nextDouble();
                bankingDetails.withdraw(wit);
                break;

            case 3:
            	bankingDetails.displayBalance();
                break;

            case 4:
            	bankingDetails.displayAccountDetails();
                break;

            case 5:
                System.out.println("Thank you for using the system.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
       } while(choice!=5);
        
        sc.close();
	
	}
}
