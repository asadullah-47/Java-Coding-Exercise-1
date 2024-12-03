package com.asad;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
//	Q6. Write a program that prompts the user to enter their first name and last name separately,
//		then prints their full name and initials.
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter First Name:");
		String f_Name=Sc.nextLine();
		System.out.println("Enter Last Name:");
		String L_Name=Sc.nextLine();
		System.out.println("Your Name is:"+ f_Name+ " "+L_Name );
	}

}
