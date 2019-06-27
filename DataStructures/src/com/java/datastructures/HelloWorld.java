/**
 * 
 */
package com.java.datastructures;

/**
 * @author Ramy
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 5;
		int b = 10;

		a += b++;
		a--;
		System.out.println ("The value of a: "+ a);
		
		int i = 1;
		int j = 0;

//		int k = i/j; 
//
//		System.out.println(k);
		
//		String KeyName = "EmpID";
//		String valueName = "EmpName";
//		String[] keys = {"1", "2", "3"};
//
//		String[] values= {"Ram", "Raju", "Vijay"};
		
		int k = Math.abs(Math.max(-5, -2));
		System.out.println(k);
		
		int x =2;
		int y =++x*2+x;
		System.out.println(++x+""+y);
		int count = 1;
		
		
		while(count<5) 
			count+=3;
		
		System.out.println(count);

	}
	public void generateOuput(String KeyName,String valueName, String[] keys, String[] values){
		
		

	}
}
