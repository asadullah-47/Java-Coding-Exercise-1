package com.exercise_1;
import java.util.*;
public class Q1 {
      public static int average(int a,int b,int c) {
    	  int average = (a+b+c)/3;
		return average;
    	  
      }
	public static void main(String[] args) {
//	Q1.Enter 3 numbers from the user & make a function to print their average.
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Average of 3 number is "+ average(a, b, c));

	}

}
