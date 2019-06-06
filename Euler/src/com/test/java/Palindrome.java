package com.test.java;

public class Palindrome {
	/*
	 * public static boolean isPalindrome(String word) {
	 * 
	 * String clean = word.replaceAll("\\s+","").toLowerCase(); StringBuffer plain =
	 * new StringBuffer(clean); StringBuffer reverse = plain.reverse(); return
	 * (reverse.toString()).equals(clean); }
	 * 
	 * public static void main(String[] args) {
	 * System.out.println(Palindrome.isPalindrome("lake")); }
	 */




	public static String[] uniqueNames(String[] names1, String[] names2) {
		String[] names3 = null;
		names3 = names1;
		
		for(int j = names3.length ;j < names2.length;j++) {
			if (names3[j] != names2[j]) {
				names3[j] = names2[j];
				System.out.println(names3[j]);
			}
		}
		return names3;
	}

	public static void main(String[] args) {
		String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
		String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
		System.out.println(String.join(", ", Palindrome.uniqueNames(names1, names2))); 
		// should print Ava, Emma, Olivia, Sophia
	}
}

