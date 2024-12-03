package com.asad;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
//		Write a program to input an integer array and a target number. Then, check if the target number is present in the array or not. If found, print its index.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int numbers[]=new int[size];
//		Input
		System.out.println("Enter value of array");
		for(int i=0;i<size;i++){
			numbers[i]=sc.nextInt();
		}
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]==x){
				System.out.println(x+" found at index " +i);
			}
		}

    sc.close();
	}

}
