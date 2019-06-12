/**
 * 
 */
package com.java.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Ramy
 *
 */
public class Balanced {

	/**
	 * @param args
	 */
	public static char[][] Tokens = {{'{','}'},{'[',']'},{'(',')'}};

	public static boolean isOpen(char c) {
		for(char[] array : Tokens) {
			if(array[0] == c) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasmatch(char open,char close) {
		for(char[] array : Tokens) {
			if(array[0] == open) {
				return array[1] == close;
			}
		}
		return false;
	}

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for(char c : expression.toCharArray()) {
			if(isOpen(c)) {
				stack.push(c);
			}else {
				if(stack.isEmpty() || !hasmatch(stack.pop(),c)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	private static String[] braces(String[] values) 
	{
		int len = values.length;
		String[] result = new String[len];

		try {
			for(int i =0;i< len;i++) {
				System.out.println("v " +values[i].toString());
				String s = values[i].toString();
				System.out.println(s+" s");
				boolean res = isBalanced(s);
				if(isBalanced(s)) {
					result[i] = "YES";
				}else {
					result[i] = "NO";
				}
			}
		}
		catch(Exception e) {System.out.println("E");}
		return result;
	}

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int valuesCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] values = new String[valuesCount];

		for (int i = 0; i < valuesCount; i++) {
			String valuesItem = scanner.nextLine();
			values[i] = valuesItem;
		}

		String[] res = braces(values);


for(int i =0;i<res.length;i++) {
		System.out.println(res[i]);
}
	}



}
