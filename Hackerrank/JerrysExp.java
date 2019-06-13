/**
 * 
 */

/**
 * @author Ramy
 *
 */

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Result {

	/*
	 * Complete the 'solve' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts STRING expression as parameter.
	 */

	public static List<Integer> solve(String expression) {

		List<Integer> iList = new LinkedList<Integer>();
		char[] c = expression.toCharArray();
		//		int x,y,z;
		//		char cp ='+';
		//		char cm ='-';
		//		char cmu = '*';
		//		char cd = '%';
		//		char cq ='?';

		for(int i =0;i<c.length;i++) {
			switch(c[i])
			{
			case('+'):	
			{
				c[i]='+';
				System.out.println(c[i]);
				break;
			}
			case('-'):{
				c[i]='-';
				System.out.println(c[i]);

				break;
			}
			case('*'):{
				c[i]='*';
				System.out.println(c[i]);


				break;
			}
			case('%'):{
				c[i]='%';
				System.out.println(c[i]);


				break;
			}
			case('?'):{
				c[i]='a';
				System.out.println(c[i]);
				break;
			}

			}

			// Write your code here

		}
		for(char ci:c)
			System.out.print(ci);

		
		

		return iList;

	}
}

public class JerrysExp {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {


		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String expression = scanner.nextLine();

		List<Integer> res = Result.solve(expression);

		for(int resi:res)
			System.out.println(resi);


		/*
		 * bufferedWriter.write( res.stream() .map(Object::toString)
		 * .collect(joining("\n")) + "\n" );
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
	}
}
