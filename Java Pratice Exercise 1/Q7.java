package com.exercise_1;
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
//		Write a program to enter the numbers till the user wants and at 
//		the end it should display the count of positive, negative and zeros entered. 
		int positive=0,negative=0,zero=0;
		System.out.println("Press 1 to continue and 0 to stop");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		while (input==1) {
			System.out.println("Enter Your Number: ");
			int number=sc.nextInt();
			if(number>0) {
				positive++;
			}else if(number<0){
				negative ++;
			}else {
				zero++;
			}
			
			System.out.println("Press 1 to continue and 0 to stop");
			input=sc.nextInt();
			
		}
		
		 System.out.println("Positives : "+ positive);
	       System.out.println("Negatives : "+ negative);
	       System.out.println("Zeros : "+ zero);

		 

	}

}
