package com.asad;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
//	Q.Write a program that takes a score (0–100) as input and prints a grade based on the following scale:
//		90 and above: "A"
//			80–89: "B"
//			70–79: "C"
//			60–69: "D"
//			Below 60: "F"
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you Marks :");
		int marks=sc.nextInt();
		if(marks>90 && marks<100) {
			
			System.out.println("A");
		}
		else if(marks>= 80 && marks<90) {
			System.out.println("B");
		}
		else if(marks>= 70 && marks<80) {
			System.out.println("C");
		}
		else if(marks>= 60 && marks<70) {
			System.out.println("D");
		}
		else if(marks<60 && marks>0) {
			System.out.println("F");
		}
		else {
			System.out.println("Invalid Marks!");
		}
		

	}

}
