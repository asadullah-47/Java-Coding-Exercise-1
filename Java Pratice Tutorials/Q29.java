package com.asad;

import java.util.Scanner;

public class Q29 {

    public static void main(String[] args) {
        // Write a program to count how many numbers in an integer array are even and how many are odd.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // Input
        System.out.println("Enter values for the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int evenCount = 0; // Count for even numbers
        int oddCount = 0;  // Count for odd numbers

        System.out.println("Even Numbers:");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                evenCount++;
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
                oddCount++;
            }
        }

        // Display counts
        System.out.println("\n\nTotal Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
    }
}
