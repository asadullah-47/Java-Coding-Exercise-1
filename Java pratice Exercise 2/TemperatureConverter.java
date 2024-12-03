package com.exersie2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature Converter");
        Scanner sc = new Scanner(System.in);
        
        while (true) { // Loop until the user decides to exit
            System.out.println("Press 1 to convert Fahrenheit to Celsius");
            System.out.println("Press 2 to convert Celsius to Fahrenheit");
            System.out.println("Press 3 to exit");
            
            int choice = sc.nextInt(); // Re-prompt choice on every loop
            
            double fahrenheit, celsius;
            
            switch (choice) {
                case 1:
                    System.out.println("Enter Temperature in Fahrenheit:");
                    fahrenheit = sc.nextDouble();
                    celsius = ((fahrenheit - 32) * 5) / 9;
                    System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
                    break;
                
                case 2:
                    System.out.println("Enter Temperature in Celsius:");
                    celsius = sc.nextDouble();
                    fahrenheit = ((celsius * 9) / 5) + 32;
                    System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
                    break;
                
                case 3:
                    System.out.println("Thanks for using the Temperature Converter!");
                    System.exit(0); // Clean exit with code 0
                    
                default:
                    System.out.println("Invalid input! Please enter 1, 2, or 3.");
            }
        }
    }
}
