/**
 * 
 */
package com.java.arrays;

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

public class RotateLeft {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	
    	int len= a.length;
    	int k = 0;
    	for(int i = 0;i < len; i++) {
    		for(int j = 0;j < d; j++) {
    			 k = a[i];
    			 a[i]=a[i+1];
    			 a[i+1]=a[i+2];
    			 a[len-1]=k;
    		}
    	}
    	
		return a;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
     //       bufferedWriter.write(String.valueOf(result[i]));
        	System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
      //          bufferedWriter.write(" ");
            	System.out.print(" ");
            }
        }

      //  bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
