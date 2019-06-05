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

public class Day25_Runtimecomplex {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int nos = scanner.nextInt();
		int no =0;
		for(int i=0;i<nos;i++) {
			no = scanner.nextInt();
			if(isPrime(no)) {
				System.out.println("Prime");    		
			}else {
				System.out.println("Not prime");
			}
		}

	}
	private static boolean isPrime(int no) {
		boolean isPrim =false;
		if((no==2)||(no==3)){
			isPrim=true;
		}else if((no<=1)||(no%2 ==0)||(no %3 ==0) ){
			isPrim = false;
		}else{
			int sq = (int) Math.sqrt(no);
			for(int i = 2;i <= sq;i++) 
			{
				if(no %i ==0){
					isPrim = false;
					break;
				}
				else {
					isPrim=true;
				}
			}
		}
		return isPrim;

	}
}

