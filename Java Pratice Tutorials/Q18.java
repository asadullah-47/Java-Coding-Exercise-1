package com.asad;
import java.util.*;
public class Q18 {

	public static void main(String[] args) {
//		Create a program to calculate the factorial of a 
//		given number using a for loop
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		long factorial=1;
		for(int i=1;i<n;i++) {
			factorial*=i;
		}
		System.out.println(factorial);
	}

}
