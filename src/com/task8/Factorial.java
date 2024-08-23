package com.task8;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Factorial Program");
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		//nextInt() method is used to get the values
		int nextInt = s.nextInt();
		//fact variable declared as 1 for calculation
		int fact=1;
		//for loop used to calculated factorial
		for(int i=1;i<=nextInt;i++)
		{
			//factorial calculation is done by fact=fact*1
			fact=fact*i;
		}		
		System.out.println("factorial of "+nextInt+" is "+fact);
	}

}
