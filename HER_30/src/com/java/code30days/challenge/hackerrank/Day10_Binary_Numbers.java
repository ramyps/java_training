/**
 * 
 */
package com.java.code30days.challenge.hackerrank;

/**
 * @author Ramy
 *
 */

import java.util.*;

public class Day10_Binary_Numbers {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws NullPointerException{
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		scanner.close();


		String strBinary = Integer.toString(n, 2);

		System.out.println(strBinary);
		   // above is binary of given in in string

		
		 int result=0;
		    String[] strparts = strBinary.split("0");
		    //above we get all strings of ones, below find max from them
		    for(int i=0;i<strparts.length;i++ )
		    {
			   // System.out.println(strparts[i]);

		        if (result < strparts[i].length()) 
		        {
		        	result = strparts[i].length();
		        }
		    }
		    System.out.println(" "+result);  //result
		
		
		
		
		
		
	/*	
		int n1=0, len=strBinary.length();
		char n3='1';
		String str="11";
		for(int i=0;i<len;i++)
		{	
			if(strBinary.contains(str))
			{
				n1++;			

			}else if(strBinary.charAt(i)==n3) 
			{
				n1=1;
			}


			/*		
			while((i+1)<len)
			{
				if((strBinary.charAt(i)==n3)&&(strBinary.charAt(i+1)==n3))
				{
					n1=1;
					n1 = n1+1;

				}

				break;
			}
		}
		System.out.println(n1);
		*/

	}
	
	
	
   
}


