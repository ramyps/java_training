/**
 * 
 */
package com.java.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ramy
 *
 */

class Res1{
	public static List<String> funWithAnagrams(List<String> s) {
		// Write your code here
		List<String> result= new ArrayList<String>();
		List chara = new ArrayList<Character>();
		int n = s.size();
		char[] c =null;

		for(int i =0;i<n;i++) {
			//for(int j=0;j<n;j++) 
			
				String s1 = s.get(i);
				c = s1.toCharArray();
				chara.add(i, c);
				System.out.println(c);
			String res = isCharanagram(s,chara);
			
		}
		
		return result;

	}
	
	public static String isCharanagram(List<String> s, List<Character> c) {
		
		String results = "";
		Object[] searchchar;
		List<String> search = null;

		
		for(int i = 0;i<s.size();i++) {
			searchchar = s.toArray();
			if(search.contains(searchchar)) {
				s.remove(i);
			}
		}
		
		
		return results;
	}

}


public class Anagrams {

	/**
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String s = null;
		List<String> anagrams = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			s = scan.nextLine();
			anagrams.add(i,s);
		}

		List<String> result = Res1.funWithAnagrams(anagrams);

		for(String s1 : result) {
			System.out.println(s1);
		}

	}

}
