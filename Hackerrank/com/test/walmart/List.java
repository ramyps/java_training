/**
 * 
 */
package com.test.walmart;

import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.xml.transform.Result;

/**
 * @author Ramy
 *
 */
public class List {

	/**
	 * @param args
	 */
	
	 public static int countNonUnique(LinkedList<Integer> numbers) {
	        LinkedList<Integer> uni=new LinkedList<Integer>();
	        int index=0;

	        for(int i=0;i<=numbers.size();i++){
	        	
	        }
	        
		 
		return 0;
		    // Write your code here

		    }
	
	
	 static LinkedList<Integer> oddNumbers(int l, int r) {
	        LinkedList<Integer> odd=new LinkedList<Integer>();
	        for(int i=l;i<=r;i++){
	            if(i%2!=0){
	                ((LinkedList<Integer>) odd).add(i);
	            }
	        }
	return odd;
	    }
	    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*        int l = scanner.nextInt();

        int r = scanner.nextInt();
        
        LinkedList<Integer> res = oddNumbers(l,r);
            for(int no:res) {
            	System.out.println(no);
            	
            	
            	
            	
            	 BufferedReader*/ 
		BufferedReader	bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

                 int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

     	        LinkedList<Integer> numbers=new LinkedList<Integer>();

                 for (int i = 0; i < numbersCount; i++) {
                     int numbersItem = Integer.parseInt(bufferedReader.readLine().trim());
                     ((java.util.List<Integer>) numbers).add(numbersItem);
                 }

                 int result = List.countNonUnique(numbers);
                 bufferedReader.close();
                 bufferedWriter.close();
             }
            

	}


