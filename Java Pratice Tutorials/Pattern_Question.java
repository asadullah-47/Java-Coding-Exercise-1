package com.asad;
import java.util.*;
public class Pattern_Question {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//	1.Solid Rectangle 
	/*	int n=4;
		int m=5;
		//outer loop
		for(int i=1;i<=4;i++) {
			//Inner Loop
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
		
//  2. Hollow Rectangle
//		int n=4;
//		int m=5;
//		//outer loop
//		for(int i=1;i<=n;i++) {
//		//inner loop
//			for(int j=1;j<=m;j++) {
//			if(i==1||j==1||i==n||j==m) {
//				System.out.print("*");
//			}	
//			else {
//				System.out.print(" ");
//			}
//			}
//			System.out.println();
//		}
//		
		
		//3.Half Pyramid
//		int n=4;
//		Outer loop
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//		System.out.print("*");
//		}
//			System.out.println();
//		}
//		4.Inverted Half Pyramid
//		int n=4;
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		5.Inverted Half Pyramid(Rotated by 180 Degree)
//		int n=4;
//		//Outer loop for Row=4
//		for(int i=1;i<=n;i++) {
//		//Inner Loop for print space
//	    for(int j=1;j<=n-i;j++) {
//	    	System.out.print(" ");
//	    }
//	    //Inner Loop for print star
//	    for(int j=1;j<=i;j++) {
//	    	System.out.print("*");
//	    }
//			System.out.println();
//	}
//		6.Half Pyramid with numbers
	
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j +" ");
//			}
//			System.out.println();
//			
//		}
//     7. Inverted Half Pyramid with numbers
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//      8. Floyd's Triangle	
//		int number=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(number +" ");
//				number=number+1;
//			}
//			System.out.println();
//		}
//		9. 0,1 triangle
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum %2==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
