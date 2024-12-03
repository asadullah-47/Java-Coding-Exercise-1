package com.exercise_1;

import java.util.Scanner;

public class Q5 {
    public static boolean ageCheckForVote(int age){
    	if(age>18) {
    		return true;
//    		System.out.println("You are eligible to vote");
    	}
    	else {
    		return false;
    	}
//    		System.out.println("You are not eligible for vote");
    	}
	
    	
 

	public static void main(String[] args) {
//		Write a function that takes in age as input and returns if that person is eligible to vote or not. 
//		A person of age > 18 is eligible to vote.
	  Scanner sc=new Scanner(System.in);
	  int age=sc.nextInt();
	  System.out.println(ageCheckForVote(age));


	}

}
