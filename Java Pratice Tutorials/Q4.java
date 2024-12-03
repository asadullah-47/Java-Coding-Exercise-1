package com.asad;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
//		Write a program that asks the user for the width and height of a rectangle
//		and then calculates and displays the area.
	System.out.println("Enter Width:");
	int width=scanner. nextInt();
	System.out.println("Enter Height:");
	int height=scanner. nextInt();
	int Area=width*height;
	System.out.println("Area of Rectangle is:"+width+"*"+height + "=" + Area);
	}

}
