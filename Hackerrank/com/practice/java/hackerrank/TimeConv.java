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
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConv {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {


		String s1 = null, s2 = null,s3=null;
		q = null;
		int hr = 0, hr1=0, n=0,n1=0;
		s1=s.trim();
		if(s1.endsWith("AM"))
		{
			n = s1.indexOf("AM");
			s2= s1.substring(0, n);
			int i=s1.indexOf(":");
			q= s1.substring(0, i);
			hr = Integer.parseInt(q);
			hr1=hr+12;
			if(hr1==24) 
			{
				s3="00";
				s2= s2.replace(q, s3);      	
			}

		}
		else if(s1.endsWith("am"))
		{
			n1=s1.indexOf("am");
			s2=s1.substring(0,n1);
			int i=s1.indexOf(":");
			q= s1.substring(0, i);
			hr = Integer.parseInt(q);
			hr1=hr+12;
			if(hr1==24)
			{
				s3="00";				
				s2= s2.replace(q, s3);      		 
			}

		}else if(s1.endsWith("PM"))
		{
			n1 = s1.indexOf("PM");
			s2= s1.substring(0, n1);
			if(s1.indexOf(":")!=-1) {
				int i=s1.indexOf(":");
				q= s1.substring(0, i);
				hr = Integer.parseInt(q);
				hr1=hr+12;
				if ((hr1)<24) {
					s3=String.valueOf(hr1);
				}    else {
					hr1=hr;
					s3=String.valueOf(hr1);

				}  			 
				s2= s2.replace(q, s3);      		 
			}    		    		 
		}else if (s1.endsWith("pm"))
		{		
			n1 = s1.indexOf("pm");
			s2= s1.substring(0, n1);
			if(s1.indexOf(":")!=-1) {
				int j=s1.indexOf(":");
				q= s1.substring(0, j);
				hr = Integer.parseInt(q);
				hr1=hr+12;
				if ((hr1)<24) {
					s3=String.valueOf(hr1);
				}else {
					hr1=hr;
					s3=String.valueOf(hr1);

				}
			}
			s2= s2.replace(q, s3);
		}
		return s2;
		/*
		 * Write your code here.
		 */

	}

	private static final Scanner scan = new Scanner(System.in);
	static String q;

	public static void main(String[] args) throws IOException {
		//BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);
		System.out.println("Result " +result);
		//  bw.write(result);
		//bw.newLine();

		//bw.close();
	}
}
