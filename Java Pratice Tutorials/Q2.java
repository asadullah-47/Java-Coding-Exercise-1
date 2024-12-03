package com.asad;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that asks the user to enter two numbers. 
//		The program should then calculate and display the sum of the two numbers.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.println("The Sum of "+n1 +"+"+ n2 +"="+ sum);
	}

}
