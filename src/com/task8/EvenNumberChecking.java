package com.task8;

import java.util.Scanner;

public class EvenNumberChecking {

	public static void main(String[] args) {
		//Variable are declared as integer
		int a;
		System.out.print("\nEven number checking");
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		int nextLine = scanner.nextInt();
		//Conditional statement 'IF ELSE' is used to check even number or not
		// operator '%' modulo is used to determine whether the value is zero
		if (nextLine%2==0)
			System.out.println(nextLine+" is a Even number");
		else 
			System.out.println(nextLine+" is not an even number");
	}

}
