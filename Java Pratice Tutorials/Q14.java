package com.asad;
import java.util.*;
public class Q14 {

	public static void main(String[] args) {
//		Write a program that takes a number as input and 
//	checks whether the number is positive, negative, or zero.Print an appropriate message.
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if(n>0) {
    	 System.out.println(n+ " is Postitive");
     }
     else if(n<0){
    	 System.out.println(n+ " is Negative");
     }
     else {
    	 System.out.println(n+" is 0");
     }
     
     
	}

}
