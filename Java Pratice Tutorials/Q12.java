package com.asad;
import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
// Q.Write a program that takes the price of an item and a discount rate as input. If the discount rate is greater than 50%, print "Invalid discount." 
//		Otherwise, calculate and print the discounted price.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price of item");
		int original_price=sc.nextInt();
		System.out.println("Enter the Discount rate");
		int dis_rate=sc.nextInt();
		if(dis_rate>50) {
			System.out.println("Invalid Discount");
		}
		else {
		double dis_price=original_price-(dis_rate*original_price/100);
		System.out.println("The Discount Price is "+ dis_price);
		}
	}

}
