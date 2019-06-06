/**
 * 
 */
package com.project_euler.problems.java;

import java.math.BigInteger;

/**
 * @author Ramy
 *The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
6857
 */
public class LargestPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();

		BigInteger zero =  BigInteger.valueOf(0);
		BigInteger one =  BigInteger.valueOf(1);
		BigInteger two =  BigInteger.valueOf(2);
		BigInteger no =  BigInteger.valueOf(600851475143L);
		BigInteger res =  BigInteger.valueOf(0);

		for(BigInteger bi=BigInteger.valueOf(2); bi.compareTo(no) == -1;bi = bi.add(one))
		{
				res = no.mod(bi);		
				if(res.equals(zero))
				{
					System.out.print(bi+" ");
					no = no.divide(bi);
				}			
		}
		if(no.compareTo(two)==1) {
			System.out.println(no);
		}

		/*
		 * Integer prime factor int n = 13195; for(int i =2;i < n;i++) {
		 * while(no.remainder(val) == 0) { System.out.print(i+" "); n = n/i; }
		 * 
		 * }if(n>2) { System.out.print(n);
		 * 
		 * }
		 */
		long endtime=System.currentTimeMillis();
		System.out.println("Time taken: "+(endtime-starttime));
	}
}
