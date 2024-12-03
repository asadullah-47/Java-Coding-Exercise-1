package com.asad;
import java.util.*;
public class Q22 {

	public static void main(String[] args) {
//	Write simple Atm Simulator
		Scanner sc=new Scanner(System.in);
	  int balance=0;
	  System.out.println("Wellcome To The the ATM Simulator");
	  while (true) {
		  System.out.println("Enter your choice");
		  System.out.println("1. Check Your Balance");
		  System.out.println("2. Depost Money");
		  System.out.println("3. Withdraw Money");
		  System.out.println("4. Exit");
		  int choice=sc.nextInt();
	  if (choice==1) {
		System.out.println("Your Balanc is "+ balance);
	  }
		else if(choice==2){
	  System.out.println("Enter Money to Deposit");
	  double deposit=sc.nextDouble();  
	  balance+=deposit;
	}
		else if(choice==3) {
		System.out.println("Enter the Amount to Withdraw");
		double withdraw=sc.nextDouble();
		if (withdraw>balance) {
			System.out.println("Balance is Low " +balance);
		} else {
			balance-=withdraw;
		}}
		else if(choice==4) {
			System.out.println("Thanks for Using ATM Simulator!Good Bye");
			break;
		}
		else {
			System.out.println("Invalid Choice.Try again");
		}
    } 	
	
		
	}
	}

