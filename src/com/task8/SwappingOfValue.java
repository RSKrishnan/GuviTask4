package com.task8;

import java.util.Scanner;

public class SwappingOfValue {

	public static void main(String[] args) {
		//Variable declared as integer
		int a, b, c=0;
		//Scanner class is defined here for reading the input from user
		Scanner s= new Scanner(System.in);
		System.out.println(" Enter the value of a & b : ");
		//nextInt method type is used for reading the integer value which is given by user
		//and value is stored in variable a, b
		 a = s.nextInt();
		 b= s.nextInt();
		System.out.println("Swapping of Value");
		System.out.println("Value of a before swapping :"+a);
		System.out.println("Value of b before swapping :"+b);
		//variable 'c' is used for swapping the value
		//Value of 'a' is assigned to 'c'
		c=a;
		//value of 'a' is assigned to 'b'
		a=b;
		//value of 'b' is assigned to 'c'
		b=c;
		//After swapping value of a and b is printed
		System.out.println("Value of a after swapping :"+a);
		System.out.println("Value of b after swapping :"+b);
		
	}

}
