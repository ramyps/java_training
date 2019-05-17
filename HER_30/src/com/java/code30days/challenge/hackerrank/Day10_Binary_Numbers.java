/**
 * 
 */
package com.java.code30days.challenge.hackerrank;

/**
 * @author Ramy
 *
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10_Binary_Numbers {



	private static final Scanner scanner = new Scanner(System.in);
	static int arr[];
	public static void main(String[] args) throws NullPointerException{
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		scanner.close();


		String strBinary = Integer.toString(n, 2);
		System.out.println(strBinary+" "+strBinary.length());
		int n1=0, len=strBinary.length();
		char n3='1';
		arr = null;
		for(int i=0;i<len;i++)
		{
			// for(int j=1;j<(len-1);j++)
			while((i+1)<len)
			{
			//	System.out.println((strBinary.charAt(i)==n3));
				if(strBinary.charAt(i)==n3) 
				{
					n1=1;
					//       	arr[i]=Integer.parseInt(strBinary.valueOf(i));
					//	System.out.println(strBinary.charAt(i)+" "+strBinary.charAt(i+1));
					if((strBinary.charAt(i)==n3)&&(strBinary.charAt(i+1)==n3))
					{
						System.out.println("in if");
						n1=n1+1;
					}
				}break;
			}

		}
		System.out.println(n1);

	}
}


