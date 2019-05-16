package com.practice.java.hackerrank;
/**
 * 
 */

/**
 * @author Ramy
 *
 */import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinBribes {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int count=0;

    	 for (int i=0;i<q.length;i++)
         {
             if((q[i]==i+1)||(q[i]==i)||(q[i]==i-1 ))
             {
             }
             else {
                 count=count+1;
             }
         }

         {
         if (count>5) {
             System.out.println("too chaotic");     
         }else {System.out.println(count);}
         }

     
    	
    	
    	
    /*	for (int i=0;i<q.length;i++)
    	{
    		if(q[i]==i+1) {
    			System.out.println(q[i]+ "equals"+i);
    		}
    		else {
    			System.out.println(q[i]+ "not equals"+i);

    			count=count+1;
    		}
    	}

    	{
    	if (count>2) {
    		System.out.println("too chaotic"); 	
    	}else {System.out.println(count);}
    	}*/

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
                System.out.println(q[i]);
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

