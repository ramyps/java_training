/**
 * 
 */
package com.java.arrays;

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
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result1 {

	/*
	 * Complete the 'winner' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts following parameters:
	 *  1. STRING erica
	 *  2. STRING bob
	 */

	public static String winner(String erica, String bob) {
		// Write your code here
		String result = null;

		char[] ericas = erica.toCharArray();
		char[] bobs = bob.toCharArray();

		int erican = getWins(ericas);
		int bobn = getWins(bobs);
		System.out.println(erican +" "+ bobn);
		if(erican > bobn) {
			result = "Erica";
		}else if (erican < bobn){
			result = "Bob";
		}else {
			result = "Tie";
		}


		return result;


	}
	public static int getWins(char[] name) {
		int win =0;
		for(int i =0 ; i<name.length;i++) {
			switch(name[i]) {
			case ('E'):
				win+=1;
			break;
			case('M'):
				win+=3;
			break;
			case('H'): 
				win+=5;
			break;
			}

		}
		return win;
		
		
	}
		

}

public class hackathon {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String erica = scan.nextLine();

		String bob = scan.nextLine();

		String result = Result1.winner(erica, bob);

		System.out.println(result);
	}
}
