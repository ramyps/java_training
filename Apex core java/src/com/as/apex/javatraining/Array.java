/**
 * 
 */
package com.as.apex.javatraining;

/**
 * @author Ramy
 * 6. Define a arrary with 10 integers and print all the elements with its index number.
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[]=  {1,2,3,4,5,6,7,8,9,0};
		System.out.println("Length of array is "+arr.length);
		for(int i =0;i<arr.length;i++) {
			System.out.println("No is "+arr[i]+" Index is "+ i);
		}

	}

}
