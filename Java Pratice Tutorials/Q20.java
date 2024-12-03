package com.asad;

public class Q20 {

	public static void main(String[] args) {
		int n=5;
		System.out.println("To print triangle");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j);	
			}
			System.out.println();
		}
		int m=5;
		System.out.println("To Inverted triangle");
		for(int w=m;w>=1;w--) {
			for(int v=1;v<w;v++) {
				System.out.print(v);
				
			}
			System.out.println();
			
		}
		
		System.out.println("pyramid pattern");
//		int o=4;
//		for(int x=1;x<=o;x++) {
//			for(int p=1;p<o-x;p++) {
//				System.out.print(" ");
//				
//			}
//		
//		 for (int a = 1; a <= 2 * x - 1; a++) {
//             System.out.print("*"); // Print stars
//         }
//		 System.out.println();
//		}
		
		 int o = 4; // Number of rows for the pyramid pattern
	        
	        for (int x = 1; x <= o; x++) { // Outer loop for rows
	            // Print spaces before the stars
	            for (int p = 1; p <= o - x; p++) {
	                System.out.print(" "); // Print spaces
	            }

	            // Print stars
	            for (int a = 1; a <= 2 * x - 1; a++) {
	                System.out.print(a); // Print stars instead of the value of 'a'
	            }

	            System.out.println(); // Move to the next line after each row
	        }
		
	}
		

}
