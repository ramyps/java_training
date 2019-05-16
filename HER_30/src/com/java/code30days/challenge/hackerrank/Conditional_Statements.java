package com.java.code30days.challenge.hackerrank;
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

public class Conditional_Statements {

	/**
	 * @param args
	 */
    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	    int N = scanner.nextInt();
//	    System.out.println(N%2==0);
       if(N%2==0){
    	   if(N>=2&&N<=5) {
    		   System.out.println("Not Weird");
    	   }else if(N>5&&N<=20) {
    		   System.out.println("Weird");

    	   }else if(N>20) {
    		   System.out.println("Not Weird");

    	   }
    	 }
    	   else {
    		   System.out.println("Weird");
    	   }

        scanner.close();
	}
}
	


