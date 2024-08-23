package com.task8;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		//Variables are declared as integer
		int a,b,c,d;
		System.out.println("Sum of numbers");
		System.out.println("Enter the value for a, b,c & d : ");
		//Value of a,,b,c,d is stored using nextInt() method
		Scanner scanner = new Scanner(System.in);
		 a = scanner.nextInt();
		 b = scanner.nextInt();
		 c = scanner.nextInt();
		 d = scanner.nextInt();
		//Conditional statement 'IF ELSE' is used for comparing
		if ((a+b)>(c+d))
			System.out.println("The sum of a and b is greater than the sum of c and d");
		else
			System.out.println("The sum of a and b is lesser than the sum of c and d");
	}

}
