package com.asad;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Q3.Create a program that takes a temperature in 
		//Celsius from the user and converts it to Fahrenheit
		System.out.println("Enter Temperature in Celsius ");
		float temp=scanner.nextFloat();
		float fahrenheit=temp*9/5+32;
		System.out.println("The Temperature in Celisus is:"+ temp );
		System.out.println("The Temperature in Fahreneit is:"+ fahrenheit );
	}

}
