package com.asad;

import java.util.Scanner;

public class prac2 {

	private static Scanner scanner;

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//variable in Java--> Variable is a container that store the data value
				//--> each variable has a specific type of data that defined which kind of data hold
				//1. int--> store whole number like(1,3,-9...)
				//2. double-->Store decimal number like(3.23,4.5,9.55....)
				//3. char-->Store only a single character like(A,a,%...)
				//4. string--> Store text like (Asad, java....)
				//5. boolean--> Store true or false
				/*int age=20;
				String name ="Asad";
				
				char Grade='B';
				double score=86.6;
				
				System.out.println("Name of Student " + name );
				System.out.println("Age of "+ name +" is:"+ age);
				System.out.println("Score of "+ name + " is:" + score);
				System.out.println("Grade of "+ name +" is:"+ Grade);*/
		       //Input in Java--> Which allow to program read data entered by user by cansole 
			 // Read Input
				// nextInt();--> Read an integer
				//nextIDouble();--> Reads decimal number
				//nextLine();--> To Reads whole line of Text
				//next();--> Read only a single word
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter You Name");
			 String name = scanner.nextLine();
			 System.out.println(name);
		}
	  
		
	}

}
