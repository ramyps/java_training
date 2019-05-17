/**
 * 1. Write a program to a specified number of generate fibonacci series. 
Note: Read the required count from the keyboard
 */
package com.as.apex.javatraining;

import java.util.Scanner;

/**
 * @author Ramy
 * execrice 1. generate fibonacci series.
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	static int fib(int n) 
	{ 
		if (n <= 1)
		{
			return n; 
		
		}
		return fib(n-1) + fib(n-2); 
	} 

	private static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int n = scan.nextInt();
		System.out.println(fib(n)); 
	}

}
