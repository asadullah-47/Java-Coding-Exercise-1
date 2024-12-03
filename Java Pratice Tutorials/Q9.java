package com.asad;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
// Q.Create a program that prompts the user to enter two numbers
//	 and then prints which one is larger.  If they are equal, print "Both numbers are equal
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter a and b");
    int a=sc.nextInt();
    int b=sc.nextInt();
    if (a<b) {
    	System.out.println("a is less to b");
    }
    else if(a>b) {
    	System.out.println("a is greater to b");
    }else {
    	System.out.println("A is equal to b");
    }
    
	}

}
