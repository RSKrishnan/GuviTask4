package com.task8;

public class PrintingAtoZ {

	public static void main(String[] args) {
		// we had declared a 'c' as char to be used in for loop
		char c;
		System.out.println("Print A to Z");
		// By using the ASCII char we will printing the value from 'A' to 'Z'
		// In for loop variable initialization, condition, Increment
		for (c = 'A'; c <= 'Z'; c++) {
			System.out.print(c+" ");
		}
	}
}
