/**
 * 
 */
package com.java.code30days.challenge.hackerrank;

/**
 * @author Ramy
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16_Exception {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int n;
		try
		{
			n=Integer.parseInt(S);
			{
				System.out.println(S);
			}
		}
		catch(Exception e)
		{
			System.out.println("Bad String");

		}
	}
}

