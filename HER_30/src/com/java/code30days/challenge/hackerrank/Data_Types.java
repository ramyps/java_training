package com.java.code30days.challenge.hackerrank;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramy
 *
 */
public class Data_Types {

	/**
	 * @param args
	 */
	
	  /* Declare second integer, double, and String variables. */
	static int i2= 9;
	static double d2=19.0;
	static String s2 ="Rivan";

    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
    
    /* Print the sum of both integer variables on a new line. */

    /* Print the sum of the double variables on a new line. */
	
    /* Concatenate and print the String variables on a new line; 
    	the 's' variable above should be printed first. */

	
    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i1 = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		  double d1 = scanner.nextDouble();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String s1 = scanner.nextLine();
	//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        solve(i1,d1,s1);

	        scanner.close();

	}
    static void solve(int i1, double d1, String s1)  {
    	System.out.println(i1+i2);
    	System.out.println(d1+d2);
    	System.out.println(s1+s2);
    	
    	
    }
    
}
