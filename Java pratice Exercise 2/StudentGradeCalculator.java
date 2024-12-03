package com.exersie2;
import java.util.*;
public class StudentGradeCalculator {

	public static void main(String[] args) {
//	Write a program to calculate a student's average marks and grade based on their input.
//		Include subject names and handle multiple students' data
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Numbers of Student:");
		int students=sc.nextInt();
		System.out.println("Enter the Numbers of Subjects:");
		int subjects=sc.nextInt();
		String  studentName[]=new String[students];
//		sc.nextLine();
		for(int i=0;i<students;i++) {
			System.out.println("Enter Student Name"+(i+1)+":");
			studentName[i]=sc.nextLine();
	sc.nextLine();
//			Marks array for students
			double Marks[]=new double[subjects];
			int totalMarks=0;
			for(int j=0;j<subjects;j++) {
				System.out.println("Enter Marks of subject"+(j+1)+":");
				Marks[j]=sc.nextDouble();
				totalMarks+=Marks[j];
			}
			double average=totalMarks/subjects;
			String grade="";
		
            if (average >= 90) {
                grade = "A";
            } else if (average >= 80) {
                grade = "B";
            } else if (average >= 70) {
                grade = "C";
            } else if (average >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            // Print student name, average marks, and grade
            System.out.println("Student: " + studentName[i]);
            System.out.println("Average Marks: " + average);
            System.out.println("Grade: " + grade);
            System.out.println();  // Blank line between students
			
		}
	}

}
