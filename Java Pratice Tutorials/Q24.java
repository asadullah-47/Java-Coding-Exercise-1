package com.asad;

public class Q24 {

	public static void main(String[] args) {
//		Print butterfly shape
		int n=5;
////		for upper half
//		for(int i=1;i<=n;i++) {
////		-->to print *
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
////		-->to print space
//			int space=2*(n-i);
//			for(int j=1;j<=space;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
////		for upper half\
//		for(int i=n;i>=1;i--) {
////			-->to print *
//				for(int j=1;j<=i;j++) {
//					System.out.print("*");
//				}
////			-->to print space
//				int space=2*(n-i);
//				for(int j=1;j<=space;j++) {
//					System.out.print(" ");
//				}
//				for(int j=1;j<=i;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		Print Hollow butterfly shape
//		upper half of butterfly
		 // Number of rows for the butterfly wings

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }


	}

