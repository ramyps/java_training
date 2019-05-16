package com.practice.java.hackerrank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        int c =0;   
         for (int i =0; i<ar.length;i++){
                c=c+ar[i];
            }
            return c;
    }

 // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

    	List<Integer> c = List.of(0,0);
		Integer aa = 0,bb = 0;
		System.out.println("start");
    	for(int i=0; i<1000; i++)
    	{
    		if(a.get(i)!=b.get(i)) {
    			System.out.println("in if "+a.get(i)+" "+b.get(i));
    		if(a.get(i)>b.get(i)) {
    			System.out.println("in if aa"+c.get(0));
    				aa=c.get(0)+1;
	    			System.out.println("aa "+aa);

    		}else {
    	    			System.out.println("in if bb "+c.get(1));
    					bb=c.get(1)+1;
    	    			System.out.println("bb "+bb);

    				} 
    			}c.set(0,aa);
    			c.set(1,bb);
    			System.out.println(c.get(0)+"C "+c.get(1));
    	}
		return c;
    }

    public static void main(String[] args) throws IOException {

  //  	simpleArraySum
		/*
		 * int[] ar = {1,2,3,4,5,6,7}; 
		 * 
		 * System.out.println(ar.length); int result =
		 * simpleArraySum(ar); System.out.println(result);
		 */
        
        
    	 // Complete the compareTriplets function below.
    	
    	List<Integer> a= List.of(1,2,3);
    	List<Integer> b= List.of(3,2,1);
        List<Integer> result = compareTriplets(a, b);
      
        

	
    }
}
