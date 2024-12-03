package com.asad;
import java.util.Scanner;
public class Conditions {

	public static void main(String[] args) {
//	Conditional statment are used in java
//	1.if-else--> The if block is used to specify the code to be executed if the condition specified in 
//	is true,the else block is executed other wise
//		int age=30;
//		if (age>18) 
//			System.out.print("Adult");

//		2. Switch-->Switch case statements are a substitute for long if statements that compare a
//		variable to multiple values. After a match is found, it executes the
//		corresponding code of that value case.
//		int n = 7;
//		switch(n) {
//		   case 1 :
//		       System.out.println("Monday");
//		       break;
//		   case 2 :
//		       System.out.println("Tuesday");
//		       break;
//		   case 3 :
//		       System.out.println("Wednesday");
//		       break;
//		   case 4 :
//		       System.out.println("Thursday");
//		       break;
//		   case 5:
//		       System.out.println("Friday");
//		       break;
//		   case 6 :
//		       System.out.println("Saturday");
//		       break;
//		   default :
//		       System.out.println("Sunday");
//		}

//     Homework Problems
//		1.
		
//		int a,b;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter First Number:");
//		a=sc.nextInt();
//		System.out.println("Enter First Number:");
//		b=sc.nextInt();
//		System.out.println("Enter Operator:");
//	  String   c=sc.next();
		

//		switch(c){
//		case "+":
//			System.out.println(a+b);
//			break;
//		case "-":
//			System.out.println(a-b);
//			break;
//		case "*":
//			System.out.println(a*b);
//			break;
//		case "/":
//			System.out.println(a/b);
//			break;
//		default:
//			System.out.println("Invalid Symbol");
//		}

//		2.
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no to find Months");
		int no=sc.nextInt();
		switch(no) {
		case 1:
			System.out.println("Janurary");
			break;
		case 2:
			System.out.println("Feburary");
			break;
			
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid Number");
		
		}
				
		
	}
}

