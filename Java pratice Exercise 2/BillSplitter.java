package com.exersie2;



import java.util.Scanner;

public class BillSplitter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the total bill amount from the user
        System.out.print("Enter total bill: ");
        float totalBill = sc.nextFloat();

        // Get the number of people from the user
        System.out.print("Enter Number of people: ");
        float totalPeople = sc.nextFloat();

        // Check if number of people is zero to avoid division by zero error
        if (totalPeople == 0) {
            System.out.println("Error: Number of people cannot be zero.");
        } else {
            // Calculate each person's share
            float share = totalBill / totalPeople;

            // Display the total bill and each person's share, formatted to 2 decimal places
            System.out.printf("Total bill is: Rs%.2f\n", totalBill);
            System.out.printf("Each person should pay: Rs%.2f\n", share);
        }
    }
}
