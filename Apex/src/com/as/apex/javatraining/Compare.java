/**
 * 4. Write a java program with following methods: 
public Boolean IsInteger(String str)
public Boolean IsOddNumber(String str)
public Boolean IsEvenNumber(String str)
public Boolean IsPrimeNumber(String str)
 */
package com.as.apex.javatraining;

import java.util.Scanner;

/**
 * @author Ramy
 *
 */
public class Compare {

	/**
	 * 
	 */
	public Compare() {
	}

	/**
	 * @param args
	 */

	public static Boolean IsInteger(String str) {

		result = false;

		if(str.isBlank()) {
			return null;}
		else {
			n = Integer.parseInt(str);
		}
		if((n>-32768) || (n<32768)) 
		{
			result = true;
		}
		return result;
	}

	public static Boolean IsOddNumber(String str) {

		result = false;
		if(str.isBlank()) {
			return null;
		}
		else {
			n = Integer.parseInt(str);
		}
		if(n%2!=0) {
			result = true;

		}
		return result;

	}

	public static Boolean IsEvenNumber(String str) {

		result = false;

		if(str.isBlank())
			return null;
		else {
			n = Integer.parseInt(str);
		}
		if(n%2==0) {
			result = true;

		}
		return result;

	}

	public static Boolean IsPrimeNumber(String str) {

		result = false;

		if(str.isBlank()) {
			return null;}
		else {
			n = Integer.parseInt(str);
		}

		if(n<=1)
		{  
			result = false;
		}else if((n==2)||(n==3))
		{
			result = true;

		}else 
		{  
			for(int i=2;i<Math.sqrt(n);i++)
			{      
				if(n%i == 0)
				{
					result = false;
				} else 
				{
					result = true;

				}
			}
		}
		return result;

	}

	private static Scanner scan=new Scanner(System.in);
	static 	boolean result = false;
	static int n =0;

	public static void main(String[] args) {

		String str = scan.next();
		System.out.println("IsInteger "+IsInteger(str)); 
		System.out.println("IsOddNumber "+IsOddNumber(str)); 
		System.out.println("IsPrimeNumber "+IsPrimeNumber(str)); 
		System.out.println("IsEvenNumber "+IsEvenNumber(str)); 



	}

}
