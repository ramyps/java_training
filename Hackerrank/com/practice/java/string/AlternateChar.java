/**
 * 
 */
package com.practice.java.string;

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

public class AlternateChar {

	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {
		int alter =0;

		int length = s.length();
		String abs="AB";
		String bas ="BA";
		String aas="AA";
		String bbs="BB";
		int ab = s.indexOf(abs);
		int ba = s.indexOf(bas);
		int aa = s.indexOf(aas);
		int bb = s.indexOf(bbs);
		System.out.println(aa+" "+ab+" "+ba+" "+bb);
		if((aa<0)||(bb<0)) {
			alter = 0;
		}else {
			for(int i=aa;i<s.length();i++) {
				if(s.indexOf(aa)>0) {
					
				}
			}
		}



		return alter;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = alternatingCharacters(s);
System.out.println(result);
			//   bufferedWriter.write(String.valueOf(result));
			//     bufferedWriter.newLine();
		}

		//   bufferedWriter.close();

		scanner.close();
	}
}
