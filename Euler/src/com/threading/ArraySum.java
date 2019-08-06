/**
 * 
 */
package com.threading;

import java.util.ArrayList;

/**
 * @author Ramy
 *
 */

class Multi extends Thread	{

	ArrayList<Integer> a = new ArrayList<Integer>();
	
	Multi(ArrayList<Integer> a1){
		this.a = a1;
		
	}
	void sum(ArrayList<Integer> a){

		int sum = 0;
		for(int j = 0;j<a.size();j++) {
			sum = sum+ a.get(j);
			System.out.println("sum now "+sum );
		}
		System.out.println("sum "+sum);
		
	}
	public void run() {
		try {

			System.out.println ("Thread is running"); 
			System.out.println(a);
//			for(int i = 0;i<10;i++) {
//				sum += i;
//				System.out.println("Sum "+sum);
//			}
			int sum = 0;
			for(int j = 0;j<a.size();j++) {
				sum = sum+ a.get(j);
//				System.out.println("sum now "+sum );
			}
			System.out.println("sum "+sum);
		}
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 

	}
}


public class ArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> aL1 = new ArrayList<Integer>();
		ArrayList<Integer> aL2 = new ArrayList<Integer>();
		ArrayList<Integer> aL3 = new ArrayList<Integer>();
		aL1.add(10);
		aL1.add(10);
		aL1.add(10);
		aL1.add(10);
		aL1.add(10);
		aL1.add(10);

		aL2.add(20);	
		aL2.add(20);	
		aL2.add(20);	
		aL2.add(20);	
		aL2.add(20);

		aL3.add(30);	
		aL3.add(30);	
		aL3.add(30);	
		aL3.add(30);	
		aL3.add(30);
		
		Multi thread = new Multi(aL1);
		thread.start();

		Multi thread1 = new Multi(aL2);
		thread1.start();
		
		Multi thread2 = new Multi(aL3);
		thread2.start();
		
		/*
		 * for(int j = 0;j<aL1.size();j++) { // System.out.println(j+" :"+aL1.get(j));
		 * sum1 = sum1+ aL1.get(j); System.out.println("sum1 now "+sum1 );
		 * 
		 * } System.out.println("sum1 "+sum1 );
		 * 
		 * for(int j = 0;j<aL2.size();j++) { // System.out.println(j+" :"+aL2.get(j));
		 * sum2 = sum2+ aL2.get(j); System.out.println("sum2 now "+sum2 );
		 * 
		 * } System.out.println("sum2 "+sum2 );
		 * 
		 * for(int j = 0;j<aL3.size();j++) { // System.out.println(j+" :"+aL3.get(j));
		 * sum3 = sum3+ aL3.get(j); System.out.println("sum3 now "+sum3 );
		 * 
		 * } System.out.println("sum3 "+sum3);
		 */
	}
}
