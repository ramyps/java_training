package com.practice.java.hackerrank;
/**
 * 
 */

/**
 * @author Ramy
 *
 */
import java.io.IOException;
import java.util.Scanner;

public class Grade {

	/*
	 * Complete the gradingStudents function below.
	 * 3 33 43 67
	 */ 
	static int[] gradingStudents(int[] grades) {
		int len=grades.length;
		int count, ne5 = 0;

		int[] fingrade = new int[len];

		for(int a=0;a<len;a++) 
		{

			if((grades[a]<100)&&(grades[a]>37))
			{
				if(grades[a]%5==0)
				{	
					fingrade[a]=grades[a];

				}
				else if(grades[a]%5!=0)
				{ 
					ne5=diviseby5(grades[a]);
					if(ne5 %5==0)
					{
						fingrade[a]=ne5;

					}else if(ne5%5!=0) 
					{
						ne5=diviseby5(ne5);
						if(ne5 %5==0) 
						{
							fingrade[a]=ne5;
						}else
						{
							fingrade[a]=grades[a];
						}
					}
					else 
					{
						ne5=diviseby5(ne5);
						if(ne5 %5!=0) 
						{
							fingrade[a]=grades[a];
						}
					}
				}
			}
			else 
			{
				fingrade[a]=grades[a];
			}
		}

		return fingrade;

	}

	private static int diviseby5(int i) {
		int by5 = 0;
		if(i%5==0)
		{
			by5=i;

		}	else if(i%5!=0) {
			i++;
			by5=i;
		}
		return by5;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(scan.nextLine().trim());
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			System.out.println(result[resultItr]);
		}


	}
}



