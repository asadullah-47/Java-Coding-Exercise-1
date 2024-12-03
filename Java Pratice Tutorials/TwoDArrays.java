package com.asad;

import java.util.Scanner;

public class TwoDArrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//	2D Arrays--> Can be defined as an array of arrays.The 2d arrays as organized as matrix which can be collection or row and columns\\
//  Q. Taking matrix as input and printing as its elements
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int row=sc.nextInt();
		System.out.println("Enter columns");
		int cols=sc.nextInt();
		int numbers[][]=new int[row][cols];
//		input
//		row
		for(int i=0;i<row;i++) {
//			columns
		
			for(int j=0;j<cols;j++) {
				numbers[i][j]=sc.nextInt();
			}}
//		Output
			for(int i=0;i<row;i++) {
//				columns
				for(int j=0;j<cols;j++) {
					System.out.print(numbers[i][j]+ " ");
				}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
