/**
 * 
 */
package com.asad;

import java.util.Scanner;

public class Striing {

	public static void main(String[] args) {
//	String-->A string is a sequence of character
//	Taking Input
Scanner sc=new Scanner(System.in);
//	String name=sc.nextLine();
//	System.out.println(" Your Name is "+ name);
//	Concatenation (Joining 2 strings)
//	String firstName="Asad";
//	String lastName="Ullah";
//	String fullName=firstName+" "+lastName;
//	System.out.println(fullName);
////	Print Length of a String
//	System.out.println(fullName.length());
////	Access characters of a string
//	for(int i=0;i<fullName.length();i++) {
//		System.out.print(firstName.charAt(i));
//	}
//	Compare 2 strings
      String name1="Asad ullah";
      String name2="Muhamma";
      if(name1.equals(name2)) {
    	  System.out.println("They are same String");      
    }else {
    	System.out.println("They are not Same");
    }
//	Convert to upper and lower Case
      System.out.println("In upper Case:"+ name1.toUpperCase());
      System.out.println("In lower case:"+name1.toLowerCase());
//     Substring
      System.out.println(name1.substring(5,name1.length()));
	 System.out.println(name1.substring(0,5));
      
    sc.close();
	}

}
