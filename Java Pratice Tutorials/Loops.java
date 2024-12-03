package com.asad;
import java.util.*;
public class Loops {

	public static void main(String[] args) {
//	Loops=>A loop is used for a block of statement repeatedly until a particular condition is satisfied
//	Q.print the number from 0 to 9 --> using for loop
	/*	System.out.println("For using for loop");
		for(int n=0;n<10;n=n+1) {
			System.out.println(n);
		}
		System.out.println("For using while loop");
		int i=0;
		while(i<10) {
		System.out.println(i);
		i=i+1;//i++
		}
		int d=0;
		System.out.println("For using do while loop");
		do {
			System.out.println(d);
			d++;
		}while(d<10);*/
		
//  --> In do while loop the statement at least one time run whether the condition true or false 
	/*
	 * int j=12; do { System.out.println("Inno Techcaves"); j++; }while(j<11);
	 */
//	Here the, we intalize j=12 and the condition is j<11, 
//		where the compile Print the statement and after that check conditions
//	Q.Print the Sum of first n Natural Number 
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=10;i=i+1) {
//			sum=sum+i;
//		}
//		System.out.println(sum);
		
//		Q.Print the table of a number given by user
		/*
		 * int n=sc.nextInt(); for(int i=1;i<=10;i++) {
		 * System.out.println(n+"*"+i+"="+n*i);
		 * 
		 * }
		 */
		
		/*
		 * int n=sc.nextInt();
		 * 
		 * for(int i=2;i<=n;i+=2) { System.out.println(i+" "); }
		 */
		System.out.println("Enter 0 or 1");
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("Please Enter Marks out of 100");
		
		}
		else if(n==0) {
			System.out.println("Stop");
		
		}
		else {
			System.out.println("Invalid Command ");
		}
	
		int marks;
	do {
		marks=sc.nextInt();
		if (marks>=90&&marks<=100) {
			System.out.println("This is a good");
		} 
		else if(marks<89 && marks>=60) {
			System.out.println("This is also Goos");
			
		}
		else if(marks>0 && marks<60) {
			System.out.println("This is also Good As well");
		}
		else
			System.out.println(marks+"Invalid Marks ");
		
		} while(marks<0 || marks>100);
	
		
		
		
	

}
}