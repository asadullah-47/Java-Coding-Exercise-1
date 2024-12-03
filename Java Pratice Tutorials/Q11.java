package com.asad;
import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
//    Q.Create a program that asks the user for a number and checks if it is even or odd. Print "The number is even" or "
//		The number is odd" accordingly.
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+ " is Even");
		}
		else {
			System.out.println(num+" is Odd");
		}
	}

}
