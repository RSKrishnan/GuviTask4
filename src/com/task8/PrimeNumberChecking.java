package com.task8;

import java.util.Scanner;

public class PrimeNumberChecking {

	public static void main(String[] args) {

		System.out.println("Prime number checking");		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		//nextInt() method is used to get the values
		int nextInt = s.nextInt();
		//flag is set to zero to check whether its prime or not
		int flag=0;
		
		int m=nextInt/2;
		//value equal to 0 and 1 is nor prime number
		if((nextInt==0)||(nextInt==1))
				System.out.println(nextInt+" is not a prime number");
		else 
			{
			//we start the for loop with intialize of i=2
			 for(int i=2;i<=m;i++)
			 	{
				 //
				 if(nextInt%i==0)
				  {
				 	System.out.println(nextInt+" is not a prime number");
				 	//flag is set to 1 to decide whether its prime or not
				 	flag=1;
				 	//to break the loop and comes out
				 	break;
				  }
				}
			 //if Flag is equal to zero means its a prime number
			 if(flag==0)
				 System.out.println(nextInt+" is a prime number");			 
			}
	}

}
