package com.asad;

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
// Write a Java program to calculate the sum and average of all elements in an integer array.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array6");
		int size=sc.nextInt();
		int numbers[]=new int[size];
//		Input
		System.out.println("Enter value of array");
		for(int i=0;i<size;i++){
			numbers[i]=sc.nextInt();
		}

       int sum=0;
     
//       Output
       for(int i=0;i<numbers.length;i++) {
    	   sum=sum+numbers[i];
       }
       int average=sum/size;
      System.out.println("The sum of array is "+sum);
	 System.out.println("The average is  "+average);
	}
}
