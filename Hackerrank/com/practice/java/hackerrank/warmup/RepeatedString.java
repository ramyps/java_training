/**
 * 
 */
package com.practice.java.hackerrank.warmup;

import java.util.Scanner;

/**
 * @author Ramy
 *
 */
public class RepeatedString {

	/**
	 * @param args
	 */
	/*
	 * static long repeatedString(String s, long n) {
	 * 
	 * String newS= s; long find=0; long length = newS.length(); while(length < n) {
	 * newS = newS.concat(s); length = newS.length(); } newS = (String)
	 * newS.subSequence(0, (int) n); for(char c : newS.toCharArray()) { if(c =='a')
	 * { find++; } } return find;
	 * 
	 * 
	 * } private static final Scanner scanner=new Scanner(System.in); private static
	 * long startTime = System.currentTimeMillis();
	 * 
	 * public static void main(String[] args) {
	 * 
	 * String s = scanner.nextLine(); long n = scanner.nextLong();
	 * 
	 * long result= repeatedString(s,n); System.out.println(result); long endTime =
	 * System.currentTimeMillis(); System.out.println("It took " + (endTime -
	 * startTime) + " milliseconds");
	 * 
	 * }
	 */
	
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
       
        long count = 0;
        
        if(n > s.length()) {
            long repeat = n/s.length();
            long diff = n % repeat;
            for(char c: s.toCharArray()) {
                if(c == 'a')
                    count++;
            }
            count = count * repeat;
            for(int i=0;i<diff;i++) {
                if(s.charAt(i) == 'a')
                    count++;
            }    
        }
        else {
            int len = (int) n;
            s = s.substring(0,len+1);
            for(char c: s.toCharArray()) {
                if(c == 'a')
                    count++;
            }
        }
        System.out.println(count);
        long endTime =System.currentTimeMillis(); 
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
    }

}
