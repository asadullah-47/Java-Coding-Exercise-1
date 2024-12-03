package com.asad;
import java.util.*;
public class Q19 {

	public static void main(String[] args) {
//		Write a program that prints numbers in reverse order from n to 1, 
//		where n is entered by the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reserve counting");
		int n=sc.nextInt();
		for(int i=n;i>0;i--) {
			System.out.print(","+i);
		}
	}

}
