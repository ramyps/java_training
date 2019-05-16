package com.java.code30days.challenge.hackerrank;
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

public class Arrays_7 {



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
        scanner.close();
        int[] arr2=swapArr(arr);

        for(int l=0;l<arr2.length;l++)
        {
        	System.out.print(arr2[l]+"\t");
        }
    }

	private static int[] swapArr(int arr[]) {
		
		int len=arr.length;
		int k =0;
		System.out.println(len);
		int swap[] = new int[len];
		for(int j=0;j<len;j++) {
			//System.out.println(len-(j+1)+ " "+j);
			k = arr[len-(j+1)];
			swap[j] = k;
			//System.out.println(swap[j] +" "+ j);
		}
		return swap;
		
	}
}
