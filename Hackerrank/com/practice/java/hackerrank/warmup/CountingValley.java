/**
 * 
 */
package com.practice.java.hackerrank.warmup;

/**
 * @author Ramy
 * 12 DDUUDDUDUUUD ==2
 * 8 UDDDUDUU == 1
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValley {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

		int valley = 0;
		char down = 'D';
		char up = 'U';

		char[] vale =s.toCharArray(); 
		int length = vale.length;
		
		for(int j = 0; j < length; j++) {
			if(j+1 < length) {
				if(((vale[j]==down)&&(vale[j+1]==up))||((vale[j]==up)&&(vale[j+1]==down))) {
					continue;
				}
				if((vale[j]==down)&&(vale[j+1]==down)){
					System.out.println("1 "+j);
				//	valley++;
					if(j+3<length) {
						if(vale[j+2]==down) {
							valley++;
							j+=1;
							System.out.println("2: "+j);

						}else if((vale[j+2]==up)&&(vale[j+3]==up)) {
							valley+=2;							
							System.out.println("3 "+j);

						}
					}
				}else {
					System.out.println("4 "+j);

				}
			}
		}
		/*
		 * for(int i=0;i<s.length();i++) { if((i+2)<s.length()) {
		 * 
		 * if((s.charAt(i)==down)&&(s.charAt(i+1)==down)) { valley+=1; }else
		 * if((s.charAt(i)==up)&&(s.charAt(i+1)==up)) { valley++; } else
		 * if((s.charAt(i)==down)&&(s.charAt(i+1)==down)&&(s.charAt(i+2)==down)) {
		 * valley+=1; }else
		 * if((s.charAt(i)==up)&&(s.charAt(i+1)==up)&&(s.charAt(i+2)==up)) { valley+=1;
		 * } }else if((i+1)<s.length()) { if((s.charAt(i)==down)&&(s.charAt(i+1)==down))
		 * { valley+=1; }if((s.charAt(i)==up)&&(s.charAt(i+1)==up)) { valley++; } } }
		 */
		return valley;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);
		System.out.println(result);
		//		bufferedWriter.write(String.valueOf(result));
		//		bufferedWriter.newLine();
		//
		//		bufferedWriter.close();

		scanner.close();
	}
}


