package com.asad;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
//		Q5.Create a program that takes two numbers and an operator (+, -, *, or /) from the user. 
//		Perform the calculation based on the operator and display the result.
// 		Note:Not using loop or statments
		System.out.println("Enter First Number:");
	int num1=Sc.nextInt();
	System.out.println("Enter Operator(+, -, *,/):");
	String ope=Sc.next();
	System.out.println("Enter Second Number:");
	int num2=Sc.nextInt();
    int result=num1+num2;
    int result1=num1-num2;
    int result2=num1*num2;
    double result3=num1/num2;
	System.out.println(num1+ "+" + num2 +"="+result);
	System.out.println(num1+ "-" + num2 +"="+result1);
	System.out.println(num1+ "*" + num2 +"="+result2);
	System.out.println(num1+ "/" + num2 +"="+result3);
	

	
	
	}

}
