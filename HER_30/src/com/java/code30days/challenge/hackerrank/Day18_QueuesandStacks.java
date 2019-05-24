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

public class Day18_QueuesandStacks {



	// Write your code here.

	char cout;
	Queue<Character> queue = new LinkedList<Character>();
	Stack<Character> stack = new Stack<Character>();


	//Queue in
	private void enqueueCharacter(char cin) {
		queue.add(cin);
	}

	//Queue out
	private char dequeueCharacter() {
		while( queue.peek()!=null) {
			cout = queue.remove();
		}
		return cout;
	}

	//Stacks in
	private void pushCharacter(char cin) {
		stack.push(cin);
	}

	//Stacks out	
	private char popCharacter() {
		while(!stack.empty()) {
			cout=stack.pop();
		}
		return cout;
	}




	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Day18_QueuesandStacks p = new Day18_QueuesandStacks();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length/2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;                
				break;
			}
		}

		//Finally, print whether string s is palindrome or not.
		System.out.println( "The word, " + input + ", is " 
				+ ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}


}