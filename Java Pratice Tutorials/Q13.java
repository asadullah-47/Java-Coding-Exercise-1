package com.asad;
import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
//   Write a program that takes a year as input and checks if it is a leap year.
//		(A year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.)
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a year to find wheteher the year is leap or not!");
       int years=sc.nextInt();
       if(years%4==0) {
    	   System.out.println(years +" is Leap Year");
       }
       else {
    	   System.out.println( years+"is Not Leap years");
       }

	}}