/**
 * 
 */
package com.java.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @author Ramy
 *
 */

class Res 
{

	public static int efficientJanitor(ArrayList<Float> weightBags)  throws Exception
	{
		List<Float> weights = new ArrayList<Float> (weightBags);
		int result =0;
		float sum = 0.0f;
		int length = weights.size();
		try {
			while(weights.size()>0) {


				for(int i = 0;i < weights.size(); i++) {
					for(int j=1; j< weights.size();j++) {
						System.out.println("size1 "+weights.size());
						sum = weights.get(i)+weights.get(j);
						System.out.println("sum "+sum);
						if ((sum <=3.0) &&(sum >=1.5)) {
							result ++;
							weights.remove(i);
							if(j>1) {
							weights.remove(j); 
							System.out.println(i+" "+j+" removed");}
							else {
								result++;
							}
							//	System.out.println("size "+weights.size());

						} 
						else if(weights.size()>0){
							result ++;
							weights.remove(i); 

						}

					}

				}
			}}catch(Exception e) {
				System.out.println("Exception");

			}
		return result;

	}

}
public class Jan {

	/**
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int len = scan.nextInt();
		ArrayList<Float> weightBags = new ArrayList<Float>();
		for(int i=0; i < len; i++) {
			float weightInt = scan.nextFloat();
			weightBags.add(weightInt);
		}

		int res = Res.efficientJanitor(weightBags);
		System.out.println(res);

		for(float weightFl : weightBags) {
			//System.out.println(weightFl);
		}

	}

}
