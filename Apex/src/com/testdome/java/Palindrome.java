/**
 * 
 */
package com.testdome.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Ramy
 *
 */

public class Palindrome {
	public static boolean isPalindrome(String word) {
		boolean b = false;
		word  = word.toLowerCase();
		System.out.println(word);
		char[] ca = word.toCharArray();
		Stack<Character> stringS = new Stack<Character>();

		Queue<Character> stringQ = new LinkedList<Character>();

		for(char c:ca) {
			stringS.add(c);
			stringQ.add(c);
		}
		int length= stringS.size();
		for(int i =0;i< length;i++) {
			if(stringS.get(i)==(((LinkedList<Character>) stringQ).get(i))) ;
			{
				b = true;

			}
		}
		//for(char c:ca) {
		System.out.println(stringS);
		System.out.println(stringQ);


		return b;
	}

	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("Deleveled"));
	}
}