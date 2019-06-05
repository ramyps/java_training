/**
 * 
 */
package com.practice.java.hackerrank;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Ramy
 *
 */
public class Listss {

	/**
	 * @param args
	 */
	static Scanner scanner = new Scanner(System.in) ;
	public static void main(String[] args) {
		System.out.println("Enter array size");
		int length = scanner.nextInt();
		List<Integer> numbers=new LinkedList<Integer>();

		for(int i=0;i<length;i++) {
			numbers.add(scanner.nextInt());
		}
		scanner.close();

		int unique= isUnique(numbers);
		System.out.println("unique:"+unique);
	//	System.out.println(numbers.toString());
	}
	private static int isUnique(List<Integer> numbers) {

		int unique=0;
		
		final Set<Integer> noduplicates = new HashSet<Integer>();
		for(int no:numbers) {
			if(!(noduplicates.add(no))) {
				unique+=1;

			}
		}
		System.out.println(noduplicates.toString());
		
		return unique;
	}

}
