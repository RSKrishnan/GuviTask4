package com.task8;

import java.util.Scanner;

public class ToCheckPersonIsSeniorCitizen {

	public static void main(String[] args) {
		
		System.out.println("To check whether a person is senior citizen");
		Scanner s = new Scanner(System.in);
		//Taking the value from the user
		System.out.print("\nEnter the age : ");
		//value is stored in the 'age' variable using nextInt() method
		int age = s.nextInt();
		//Used if condition to check the age of the person
		if (age>=60)
			System.out.println("The person with is a senior citizen");
		else
			System.out.println("The person with not an senior citizen");
	}

}
