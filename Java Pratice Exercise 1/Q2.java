package com.exercise_1;

import java.util.Scanner;

public class Q2 {
	public static int sumOddNumber(int n) {
		int sum=0;
	for(int i=1;i<=n;i++) {
		if(i%2!=0) {
			sum=sum+i;
		}
	}
	return sum;
	}
	public static void main(String[] args) {
//	Q2.Write a function to print the sum of all odd numbers from 1 to n.
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum of odd number is "+ sumOddNumber(n));


	}

}
