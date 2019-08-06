package com.practice.java.hackerrank;

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

//4 1
//3 10 2 9
//7
public class BonAppetit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int n= bill.size();
        int total=0,no=0,actual=0,bal=0;
        //System.out.println(n);
        for(int i=0;i<n;i++)
        {
        	//System.out.println(i + " at  "+bill.get(i));
        	total+=bill.get(i);
        	if(k==i) {
        		//System.out.println("she didnt eat :" +bill.get(i));
        	no = bill.get(i);}
        }
       // System.out.println("total is "+total);
        actual=(total-no)/2;
        
        //System.out.println(total/n);
        if(b<=actual) {System.out.println("Bon appetite");
        }else {System.out.println(b-actual);}
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
