/**
 * 
 */
package com.cj.basics;

/**
 * @author Ramy
 *
 */
public class forLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		addevenNos();
	}

	static void addevenNos(){
		int sum =0;
		for(int i =8; i > 0;i -= 2) {
			sum += i;
		}
		System.out.println("Even sum : "+sum);
	}
}
