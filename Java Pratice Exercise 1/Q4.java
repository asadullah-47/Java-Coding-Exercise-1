package com.exercise_1;

import java.util.Scanner;

public class Q4 {
	static public double circle(int radius) {
		double pi=3.141;
		double c=2*pi*radius;
		return c;
		
	}

	public static void main(String[] args) {
//		Q4.Write a function that takes in the radius as input and returns the circumference of a circle.
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		System.out.println("Circumeference of a circle is"+ circle(radius));

	}

}
