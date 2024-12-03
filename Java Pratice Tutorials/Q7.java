package com.asad;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
//		Write a program that asks for the radius of a circle and then
//		 calculates and prints both the area and circumference. 
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circle:");
		double radius=Sc.nextFloat();
		double pi=3.14;
		double Area=pi*(radius*radius);
		double Circumference=2*pi*radius;
		System.out.println("Area is:"+ Area);
		System.out.println("Circumference is:"+ Circumference);
	}

}
