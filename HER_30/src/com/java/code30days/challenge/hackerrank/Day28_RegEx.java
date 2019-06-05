/**
 * 
 */
package com.java.code30days.challenge.hackerrank;

/**
 * @author Ramy
 *Input 
 *6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com

Output 
julia
julia
riya
samantha
tanya

 */

import java.io.*;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Names{
	String name, email;
	public Names(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public String toString() 
	{ 
		return  this.name; 
	} 

}
class Sortbyname implements Comparator<Names> {
	public int compare(Names a, Names b) {
		return a.name.compareTo(b.name); 
	}

}


public class Day28_RegEx {	

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String[] firstNameEmailID=null;
		String firstName =" ";
		String emailID = " ";
		ArrayList names=new ArrayList<Names>();
		String s ="@gmail.com";

		for (int NItr = 0; NItr < N; NItr++) {
			firstNameEmailID = scanner.nextLine().split(" ");
			firstName = firstNameEmailID[0];
			emailID = firstNameEmailID[1];
			if(emailID.endsWith(s)) {
				names.add(new Names(firstName,emailID));
			}
		}
		scanner.close();


		Collections.sort(names,new Sortbyname()); 

		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i).toString()); 
		}


		long endTime =System.currentTimeMillis(); 
		System.out.println("It took " + (endTime - startTime) + " milliseconds");
	}

}
