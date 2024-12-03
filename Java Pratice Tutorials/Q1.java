package com.asad;

import java.util.Scanner;

public class Q1 {
//	Write a program that prompts the user to enter their first name and age,
//	then prints a greeting message that includes both values.
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter You Name");
		 String name=scanner.nextLine();
		 System.out.println("Enter You Age");
		 int age=scanner.nextInt();
		 System.out.println("Hello!"+ name + "Your Age is:"+ age);
	}

}
