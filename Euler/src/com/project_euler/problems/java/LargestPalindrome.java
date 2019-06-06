/**
 * 
 */
package com.project_euler.problems.java;

import java.math.BigInteger;

/**
 * @author Ramy
 *A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long mulRes = 0;

		for(long l=999;l >= 100;l--) {
			for(long k = 999;k>=100;k--) {
			mulRes = l*k;
			if (isPalindrome(mulRes)) {
				System.out.println(mulRes +" is Palindrome"+ l +" "+k);
			}
			}
		}
	}

	private static boolean isPalindrome(long mulRes) {
		long temp, rem, sum = 0;

		boolean isPalindrome= false;
		temp = mulRes;    

		while(mulRes>0) {
			rem = mulRes%10;
			//System.out.print(" in 1 " +rem);

			sum = (sum*10)+rem;
			//System.out.print(" in 2 "+sum);

			mulRes = mulRes/10;
			//System.out.print(" in 3 "+mulRes);

		}
//		System.out.println(sum+"  "+temp);
		if(temp == sum)   
			isPalindrome =  true;

		return isPalindrome;
	}

}


/*
 * BigInteger one = BigInteger.valueOf(1); BigInteger max =
 * BigInteger.valueOf(999); for(BigInteger bi =
 * BigInteger.valueOf(999);bi.compareTo(max) == 1; bi = bi.subtract(one)) {
 * mulRes = max.multiply(bi); System.out.println(mulRes); if (isPalindrome(max))
 * { System.out.println(mulRes); }
 * 
 * }
 * BigInteger zero = BigInteger.valueOf(0);
BigInteger ten = BigInteger.valueOf(10);
while(mulRes.compareTo(zero)==1){    //n>0
	System.out.println("in while");
	rem = mulRes.mod(ten);//n%10;  //getting remainder  
	sum = (sum.multiply(ten)).add(rem); //(sum*10)+r;    
	mulRes= mulRes.divide(ten);   
	// n = n/10    

}    
 */
