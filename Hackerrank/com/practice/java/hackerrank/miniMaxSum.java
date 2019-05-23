package com.practice.java.hackerrank;
import java.util.Scanner;

public class miniMaxSum {

    // Complete the miniMaxSum function below.
	private static void miniMaxSum(int[] arr) 
    {

    	long c[] = null, min = 0,max = 0;
    	int len = arr.length;
    		for(int i=0;i<len;i++) {
    			System.out.println("in for loop 1");
    			System.out.println(arr[i]);
    			System.out.println("in for loop 2");
    			c[i]=arr[i+1]+c[i];
        		System.out.println(c[i]);
    		}
    		for (int j=0;j<c.length;j++)
    		{
    			if(c[j]>c[j+1]) 
    			{ 
    				min=c[j];
    				max=c[j+1];
    			}
    		}
    		System.out.println(min+" "+max);
    		
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }		
	
}
