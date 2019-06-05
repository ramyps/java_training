/**
 * 
 */
package com.java.code30days.challenge.hackerrank;

/**
 * @author Ramy
 *
 */

import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Day26_Nested {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		long startTime = System.currentTimeMillis();
		int actualDate = 0,actualMon = 0,actualYear = 0,expectedDate = 0,expectedMon = 0,expectedYear = 0;


		String[] s1 = scanner.nextLine().split(" ");
		actualDate = Integer.parseInt(s1[0]);
		actualMon = Integer.parseInt(s1[1]);
		actualYear = Integer.parseInt(s1[2]);

		String[] s2 = scanner.nextLine().split(" ");
		expectedDate = Integer.parseInt(s2[0]);
		expectedMon = Integer.parseInt(s2[1]);
		expectedYear = Integer.parseInt(s2[2]);

		int actuals = 0;
        if((actualYear<expectedYear)){
        	//23 12 1234
        	//19 9 2468
        	actuals=0;
        }
        else if((actualYear-expectedYear > 0)&&(actualYear-expectedYear!=0)) {
			actuals = 10000;
			//1 1 2010
			//31 12 2009
		}else if((actualMon-expectedMon > 0)&&(actualYear-expectedYear == 0)) {
			//31 8 2004
			//20 1 2004
			actuals = 500 * (actualMon-expectedMon);
		}else if(actualDate-expectedDate>0){
			actuals = 15*(actualDate-expectedDate);
			//9 6 2015
			//6 6 2015
		}
		System.out.println(actuals);
		
		long endTime =System.currentTimeMillis(); 
		System.out.println("It took " + (endTime - startTime) + " milliseconds");
	}
}

/*
 * LocalDate actual = LocalDate.of(actualYear,actualMon,actualDate); LocalDate
 * expected = LocalDate.of(expectedYear,expectedMon,expectedDate); long
 * noOfDaysBetween = ChronoUnit.DAYS.between(expected, actual);
 * //System.out.println(noOfDaysBetween); long actuals = 15*(noOfDaysBetween);
 * System.out.println(actuals);
 * &&(actualMon<expectedMon)&&(actualDate<expectedDate)
 */