/**
 * 
 */
package com.practice.java.hackerrank.warmup;

import java.util.Scanner;

/**
 * @author Ramy
 * Input 7
0 0 1 0 0 1 0
Output 4
 */
public class JumpingClouds {

	private static int arrays[] = null;
	private static Scanner scanner;
	private static int result;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		//System.out.println("Enter array length");
		int length = scanner.nextInt();
		arrays = new int[length];
		for(int i=0;i<length;i++) { 
			int no= scanner.nextInt();
			arrays[i] = no;
		}
		result = jumpingOnClouds(arrays);
		System.out.println(result);

	}

	private static int jumpingOnClouds(int[] array) {
		
		int jumps=-1;
		
		for(int i=0;i<array.length;i++,jumps++) {
			if((i+2<array.length)&&(array[i]!=1)) {
				i++;
			}
		}
		
		
		
		/*
		 * for(int i = 0;i<array.length;i++) { if(array[i]!=1) {
		 * if((array[i+2]<array.length)&&(array[i+2]!=1)) { jumps++; i = i+1;
		 * System.out.println("2: "+i);
		 * 
		 * } else if(array[i]+1!=1){ jumps++; System.out.println(i);
		 * 
		 * } } }
		 */
		
		
		
		return jumps;
	}

}
