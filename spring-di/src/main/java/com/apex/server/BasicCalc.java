/**
 * 
 */
package com.apex.server;

/**
 * @author Ramy
 *
 */
public class BasicCalc implements Calc {

	/**
	 * @param args
	 */
	public int add(int i, int j) {
		return i+j;
	}
	public int subtract(int i, int j) {
		return i-j;
	}public int prod(int i, int j) {
		return i*j;
	}public int div(int i, int j) {
		return i/j;
	}
}
