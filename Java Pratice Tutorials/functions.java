package com.asad;
import java.util.*;
public class functions {
	
//	public static int sum(int a,int b) {
//		int sum=a+b;
//		return sum;
//	}
//	public static void factorialPrint(int n) {
//		int factorial =1;
//		if(n<0) {
//			System.out.println("Invalid Number");
//			return;
//		}
//		
//		for(int i=n;i>=1;i--) {
//			factorial*=i;
//		}
//		System.out.println(factorial);
//		return;
//	}
//	public static int printProduct(int a, int b) {
//		return a*b;
//	}
	public static boolean  checkPrimeNumber(int n) {
		if(n<1) {
			return false;
		}
	for(int i=2;i*i<=n;i++) {
		if(n % i == 0) {
			return false;
		}
		
	}
	return true;
		
	}

	public static void main(String[] args) {
//	Functions--> A functions is a block of code which operate a specific task,it help reusing code and 
//		making program easier to read and organizing the logic
//	 Q1.Calculate the sum of two numbers a,b by using functions
		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//	int sum=sum(a, b);
//		System.out.println(sum);
//		Q2.find facrorial of a number using functions
//		int n=sc.nextInt();
//		factorialPrint(n);
//		Q3. Write a function to calculate the product of 2 numbers.
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println(a+"*"+b+"="+printProduct(a, b));
//		Q4.Make a function to check if a number is prime or not.
		int n=sc.nextInt();
		if(checkPrimeNumber(n)) {
			System.out.println(n + " is prime Number");
		}else {
			System.out.println(n + " is not prime Number");
		}
		
	}

}
