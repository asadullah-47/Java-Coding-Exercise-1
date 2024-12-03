package com.asad;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
// Quiz:Write a program that takes a user's age as input. If the age is 18 or older, print "You are eligible to vote." 
//	Otherwise, print "You are not eligible to vote.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you age to Check Eligiblity for Vote:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("You are Eligible");
		}
		else {
			System.out.println("You are not eligible");
		}

	}

}
