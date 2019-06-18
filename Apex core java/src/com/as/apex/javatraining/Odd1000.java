/**
 * 
 */
package com.as.apex.javatraining;

/**
 * @author Ramy
 * 5. Generate following
Generate 1000 numbers
Generate multiple of 5 and less than 1000
Generate odd numbers up to 1000
 */
public class Odd1000 {

	public static void main(String[] args) {
		print1000();
		odd1000();
		mul5odd1000();

	}

	private static void mul5odd1000() {
		for(int i=1; i<=200;i++) {
			System.out.println(5*i);
		}
	}

	private static void odd1000() {
		for(int i=1; i<=1000;i++) 
		{
			if(i%2!=0) 
			{
				System.out.println(i);
			}	
		}		
	}

	private static void print1000() {
		for(int i=1; i<=1000;i++) {

			System.out.println(i);

		}	
	}

}
