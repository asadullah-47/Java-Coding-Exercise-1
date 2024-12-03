package com.asad;
import java.util.*;
public class Q15 {

	public static void main(String[] args) {
//Write a program that takes a single character as input and checks  
//whether it is a vowel (a, e, i, o, u) or a consonant.Handle both uppercase and lowercase letters.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter character to find Vowel or not?");
		String Cha=sc.next();
		switch(Cha) {
		case "a":
			System.out.println("Vowel");
		break;
		case "A":
			System.out.println("Vowel");
		break;
		case "e":
			System.out.println("Vowel");
		break;
		case "E":
			System.out.println("Vowel");
		break;
		case "i":
			System.out.println("Vowel");
		break;
		case "I":
			System.out.println("Vowel");
		break;
		case "o":
			System.out.println("Vowel");
		break;
		case "O":
			System.out.println("Vowel");
		break;
		case "u":
			System.out.println("Vowel");
		break;
		case "U":
			System.out.println("Vowel");
		break;
		default:
			System.out.println("Not Vowel");
		}
	}

}
