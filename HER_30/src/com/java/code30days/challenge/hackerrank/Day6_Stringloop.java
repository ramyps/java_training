package com.java.code30days.challenge.hackerrank;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramy
 *
 */
public class Day6_Stringloop {

	/**
	 * @param args
	 */
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String s=null;
		int i=scanner.nextInt();
		for(int j=0;j<=i;j++) 
		{
			s=scanner.next();
			evenodd(s);
		}
	}

	private static void evenodd(String s) {
		String even="",odd="";
		char eve=' ',od= ' ';
		int len=s.length();
		for(int k=0;k<len;k++)
		{
			if((k%2==0) || (k==0))
			{
				eve=s.charAt(k);
				even= even+eve;
			}else {
				od = s.charAt(k);
				odd=odd+od;
			}
		}
		System.out.println(even+" "+odd);
	}

}
