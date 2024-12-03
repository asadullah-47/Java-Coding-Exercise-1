package com.asad;
import java.util.*;
public class Q17 {

	public static void main(String[] args) {
//		Write a program that asks the user to input a number and 
//		then prints the multiplication table for that number (up to 10).

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int t=1;
		System.out.println("Table of "+n);
		for(int i=1;i<=10;i++) {
	    t=n*i;
	    
	    System.out.println(n+"*"+ i+"="+t);
		}
		
		
		
	}

}
