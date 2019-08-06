/**
 * 
 */
package com.cj.basics;

/**
 * @author Ramy
 * String methods 
 */
public class stringEg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String r = "Rivan";
		String p = "Pavan";
		String s ="rivan";
		String g =" is       good ";
		System.out.println(r.concat(g));
		System.out.println(r.charAt(0));
		System.out.println(r.compareTo(s));
		System.out.println(r.equalsIgnoreCase(s));
		System.out.println(r.compareToIgnoreCase(s));
		System.out.println(r.regionMatches(2, p, 2, 3));
		System.out.println(g.strip());
		System.out.println(g.trim());
		System.out.println(g.replaceAll("\\s+",""));


	}

}
