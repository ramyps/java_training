/**
 * 
 */
package com.java.datastructures;

/**
 * @author Ramy
 * Multiply in Matrix
 */

public class Matrix {

	static int[][] mult(int a[][], int b[][]) {
		int rows = a.length;
		int cols = b[0].length;
		int size = b.length;
		int[][] res = new int[rows][cols];

		for(int k = 0; k < rows; k++) {
			for(int j = 0; j < cols; j++) {
				int ret = 0;
				for(int x = 0; x < size; x++) {
					ret += a[k][x] * b[x][j];
				}
				res[k][j] = ret;
			}
		}
		return res;
	}
  
	static void print(int a[][]) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " "); 
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][] = {
			{1, 2},
			{0, 1},
			{1, 0}};
	  
		int b[][]= {
			{1},
			{0}};
			
		print(mult(a, b));
	}
}
