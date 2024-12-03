package com.asad;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//    Array--> is a list of elements of the same type i.e. a list of integer,a list of string ,a list of boolean etc...
//		we can write array in 3 different method
//		1.creating array in new keywords-->int[] marks = new int[3];
//		marks[0] = 97;
//		marks[1] = 98;
//		marks[2] = 95;
//		2.int[] marks = {98, 97, 95};
//		3. By using user Input
//		Q1.Taking an array as an input and printing its elements.
		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		int numbers[]=new  int[size];
//		for(int i=0;i<size;i++) {
//			numbers[i]=sc.nextInt();
//		}
//		for(int i=0;i<size;i++) {
//			System.out.println(numbers[i]+ " ");
//		}
//		Q2.Find the maximum & minimum number in an array of integers. 
//		int size=sc.nextInt();
//		int numbers[]=new  int[size];
//		Input
//		for(int i=0;i<size;i++) {
//			numbers[i]=sc.nextInt();
//		}
//		int max=Integer.MAX_VALUE;
//		int min=Integer.MIN_VALUE;
////		Output
//		for(int number:numbers) {
//			if(numbers[number]<min) {
//				min=numbers[number];
//			}
//			if(numbers[number]>max) {
//				max=numbers[number];
//				
//			}
//		}
//		  System.out.println("Largest number is : " + max);
//	       System.out.println("Smallest number is : " + min);
		//input
//	      for(int i=0; i<size; i++) {
//	          numbers[i] = sc.nextInt();
//	      }
//
//
//	      int max = Integer.MIN_VALUE;
//	      int min = Integer.MAX_VALUE;
//	     
//	       for(int i=0; i<numbers.length; i++) {
//	           if(numbers[i] < min) {
//	               min = numbers[i];
//	           }
//	           if(numbers[i] > max) {
//	               max = numbers[i];
//	           }
//	       }
//
//
//	       System.out.println("Largest number is : " + max);
//	       System.out.println("Smallest number is : " + min);
//		int size=5;
//		int number[]=new int[size];
////		input
//		for(int i=0;i<size;i++) {
//			number[i]=sc.nextInt();
//		}
////		output
//		for(int i=0;i<size;i++) {
//			System.out.println(number[i]);
//		}
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		if(a>b) {
//			System.out.println(a+ "is larger number");
//		}else {
//			System.out.println(b+" is larger number");
//		}
		
		int number=sc.nextInt();
		if(number>0) {
			System.out.println(number+" is positive");
		}else if(number<0) {
		System.out.println(number+" is Negative");
		}else {
			System.out.println(number+" is zero");
		}
		

	}     

}
