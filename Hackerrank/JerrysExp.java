/**
 * 
 */

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
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING expression as parameter.
     */

    public static List<Integer> solve(String expression) {
    	
    	char[] c = expression.toCharArray();
    	int x,y,z;
    	char cp ='+';
    	char cm ='-';
    	char cmu= '*';
    	char cd = '%';
    	
    	for(char ci:c) {
    		if(ci.equals(cp){
    			
    		}
    		
    	}
    			
    	
		return null;
    // Write your code here

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
