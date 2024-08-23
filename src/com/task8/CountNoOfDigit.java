package com.task8;

import java.util.Scanner;

public class CountNoOfDigit {

	public static void main(String[] args) {

		System.out.println("Count number of digit in Integer");		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		//nextInt() method is used to get the values
		int nextInt = s.nextInt();
		//a variable count is declared to count the number of digits in integer
		int count=0;
		//to check when the value is given zero
		if(nextInt==0)
			System.out.println("zero");
		else 
		{
			//while loop until the condition of nextInt variable gets zero
			while(nextInt!=0)
			{
				//nextInt variable is divided by 10 so we we can count it easily
				nextInt=nextInt/10;
				//variable count will be increased until the loop is success 
				count++;
			}
		}
		System.out.println("Number of digit in Integer : "+count);
	}

}
