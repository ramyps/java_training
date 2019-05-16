package com.practice.java.hackerrank;
/**
 * 
 */

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

public class Stair {

	// Complete the staircase function below.
	/*static void staircase(int n)
	{
		String[][] stair=new String[n][n];
		String sym= "#", space="no";
	 
		int i,j;

		for(i=1;i<=n;i++) {
			for( j=n;j>i;j++) {
				
                System.out.printf(" ");

                for( int k = 1;k<=i;k++)
                {
                    System.out.printf("#");
                }
               System.out.println();
				
				
				/*if((i==(n-1))||(j==(n-1)))
				{
					stair[i][j]=sym;
				}
				else if((n-2!=0) || (n-2==1))
				{
					if((i==(n-2))||(j==(n-2)))
					{
						stair[i][j]=sym;
					}
				}				
				else if((i==0)&&(j==0))
				{	
					stair[i][j]=space;

				}else if((i==0)||(j==0))
				{
					stair[i][j]=space;

				}*/
	//		}
	//	}
	/*	for( i = 0; i < n; i++) {
			for( j = 0; j < n; j++) {
				System.out.print(stair[i][j]+" ");
			}				
			System.out.println();
		}*/


	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	//	staircase(n);
		
		String str="#";
	    for (int i=0;i<n;i++)
	        { 
	        System.out.printf("%"+n+"s%n",str);
	        str=str+"#";
	    }

		scanner.close();
	}
}
