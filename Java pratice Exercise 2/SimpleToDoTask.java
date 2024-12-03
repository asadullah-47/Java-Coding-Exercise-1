package com.exersie2;
import java.util.*;
public class SimpleToDoTask {

	public static void main(String[] args) {
		/*
		  Write a program that allows users to:
		  --> Add tasks to a to-do list. View all tasks.
		  --> Remove a task by its number.
		 */
		Scanner sc=new Scanner(System.in);
		String Task[]=new String[10];
		int tasksCount=0;
		int choice=0;
		while(true) {
//			Input choice from user
			System.out.println("To-Do List Options:");
		    System.out.println("1. Add a Task");
		    System.out.println("2. View All Tasks");
		    System.out.println("3. Remove a Task");
		    System.out.println("4. Exit");
			System.out.println("Enter You choice");
			 if (sc.hasNextInt()) {
	                choice = sc.nextInt(); // Assigning choice based on user input
	            } else {
	                System.out.println("Invalid input, please enter a number.");
	                sc.next(); // Clear the invalid input
	                continue; // Skip the rest and prompt again
	            }
			 sc.nextLine();
			switch(choice) {
			case 1:
				if(tasksCount<Task.length) {
					
				System.out.print("Enter the Task");
				String task=sc.nextLine();
				Task[tasksCount]=task;
				tasksCount++;
					System.out.println("Task added succesfully!");
				}else {
					System.out.println("Task list is Full,can not add more Task");
				} 
				break;
			case 2:
				if(tasksCount==0) {
					System.out.println("No Task to Display");
				}else {
					System.out.println("You Task");
					for(int i=0;i<tasksCount;i++) {
						System.out.println((i+1)+","+Task[i]);
					}
				}
			case 3:
				System.out.println("Enter the Task number to reomve");
				int taskNum=sc.nextInt();
				if(taskNum>0 && taskNum<tasksCount) {
			      for(int i=taskNum-1;i<tasksCount-1;i++) {
			    	  Task[i]=Task[i] + 1;
			    	  
			      }
			      Task[tasksCount-1]=null;
			      tasksCount--;
			      System.out.println("Task are removed successfully");
				}else {
					System.out.println("Invalid Task number");
				}
				break;
			case 4:
				System.out.println("Exiting the program. Goodbye!");
                System.exit(0);
			 default:
                 System.out.println("Invalid choice. Please try again.");
			}
		}

	}

}
