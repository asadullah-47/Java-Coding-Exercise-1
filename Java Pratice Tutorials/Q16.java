package com.asad;
import java.util.*;
public class Q16 {

	public static void main(String[] args) {
//		Write a program to calculate the sum of numbers from 1 to n, 
//		where n is entered by the user.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			
		}
		System.out.println("The sum of 1 to "+n+"="+sum);

	}

}
