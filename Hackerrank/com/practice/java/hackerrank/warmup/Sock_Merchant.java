/**
 * 
 */
package com.practice.java.hackerrank.warmup;

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

public class Sock_Merchant {

	// Complete the sockMerchant function below.
	static int sockMerchantm(int n, int[] ar) {

		int sale = 0;


		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				while(i!=j){
	//				System.out.println(ar[i] +" "+ ar[j]);
				if(ar[i] == ar[j] &&ar[i]!=0 &&ar[j]!=0 )
				{
					
					System.out.println(ar[i] +" matches "+ ar[j]);
				
					ar[i]=0;
					ar[j]=1;
					sale =sale+1;
					break;
				}break;
			}break;
		}
			
		}
		System.out.println(sale);
		//sale = sale/2;

		return sale;


	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchantm(n, ar);
		System.out.println(result);

		/*     bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

		scanner.close();
	}
}
