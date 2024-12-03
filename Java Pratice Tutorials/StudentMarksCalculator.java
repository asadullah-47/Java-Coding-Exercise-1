package com.asad;

import java.util.Scanner;

public class StudentMarksCalculator {
    public static char calculateGrade(double average) {
    	if(average>=90&& average<=100) {
    		return 'A';
    	}else if(average>70 && average<90) {
    		return 'B';
    	}else if(average>60 && average <70) {
    		return 'C';
    	}else if(average >50 && average<60) {
    		return 'D';
    	}else {
    		return 'F';
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int subjects=0;
		int marks[]=null;
		boolean exit=false;
		while (!exit) {
		System.out.println("Press 1 for Input Marks");
		System.out.println("Press 2 for View Results");
		System.out.println("Press 3 for Exit");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Enter the number of Subjects:");
			subjects=sc.nextInt();
			 marks=new int[subjects];
			 for(int i=0;i<subjects;i++) {
			System.out.println("Enter marks for Subjects "+(i+1)+":");
			marks[i]=sc.nextInt();
			 }
			 System.out.println("Marks input completed!");
             break;
		case 2:
			if(marks==null||subjects==0) {
				System.out.println("No Marks entered yet!Please first Enter Marks");
			}else {
				int total = 0;
				for(int mark:marks) {
					total+=mark;
				}
				double average=total/subjects;
				char grade=calculateGrade(average);
				System.out.println("\n--- Results ---");
		        System.out.println("Total Marks: " + total);
		        System.out.println("Average Marks: " + average);
		        System.out.println("Grade: " + grade);
			}
			break;
		case 3:
			exit=true;
			System.out.println("Exiting the Program!Good Buy");
			break;
			default:
				System.out.println("Invalid choice!Please try again");
		}
		}
		}
		}
		
		
		
//		
//		}
//		double average=total/subjects;
//		char grade=calculateGrade(average);
//		System.out.println("\n--- Results ---");
//        System.out.println("Total Marks: " + total);
//        System.out.println("Average Marks: " + average);
//        System.out.println("Grade: " + grade);
//           
//	}
//
//}
