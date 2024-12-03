package com.exercise_1;

import java.util.Scanner;

public class Q3 {
    public static int findMaximum(int a,int b) {
    	if(a>b) {
    		return a;
    		
    	}else {
    			return b;
    	}
    	
    
    }

	public static void main(String[] args) {
//	Q3.Write a function which takes in 2 numbers and returns the greater of those two.
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("The greater Number is "+findMaximum(a, b));

	}

}
