package com.practice.java.hackerrank;
/**
 * 
 */

/**
 * @author Ramy
 *
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NegPosArray {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) 
    {
    	int len=arr.length;
    	int pos = 0,neg = 0,zero = 0;
    	double dpos=0, dneg=0, dzero=0;
    	
    	for(int k = 0; k < len;k++) 
    	{
    		if((arr[k]==0)) {
    			zero=zero+1;
    			
    		}else if(arr[k]>0) {
    			pos=pos+1;
    			
    		}else if(arr[k]<0) {
    			neg=neg+1;
    		}    		
    	}
    	dpos = (double)pos/len;
    	dneg = (double)neg/len;
    	dzero = (double)zero/len;
    	System.out.println(dpos);
    	System.out.println(dneg);
    	System.out.println(dzero);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
