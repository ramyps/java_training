package com.java.code30days.challenge.hackerrank;
//Day14_Scope



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
	private int[] elements;
	public int maximumDifference;
	int len = 0;

	public Difference(int[] a) 
	{
		this.elements=a;
	}
	public void computeDifference() 
	{
		Arrays.sort(elements);
		len = elements.length;
		maximumDifference = elements[len-1]-elements[0];
	}	
		/*
		 * len=elements.length; try { for (int i = 0; i < len ; i++) { while((i+1)<len)
		 * { System.out.println(i+"is "+(elements[i]+" "+elements[i+1])); difference[i]
		 * = elements[i+1] - elements[i]; System.out.println("dif is "+difference[i]); }
		 * }
		 * 
		 * sort(difference);
		 * 
		 * for(int j=0;j < difference.length;j++) { if(difference[j] > difference[j+1])
		 * { maximumDifference = difference[j]; } } }catch(NullPointerException e) {
		 * 
		 * }
		 */}

	// Add your code here

 // End of Difference class

public class Day14_Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}