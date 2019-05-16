package com.java.code30days.challenge.hackerrank;
/**
 * 
 */

/**
 * @author Ramy
 *
 */

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Phonenumber8{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Map<String,Integer> phoneno = new HashMap<String,Integer>();
  
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          // Write code here
          
          phoneno.put(name, phone);
          
      }
      while(in.hasNext()){
          String s = in.next();
          // Write code here
         if(phoneno.get(s)!=null)
         {
        	 System.out.println(s+" "+phoneno.get(s));
         }else
         {
        	 System.out.println("Not found");
         }
      }
      in.close();
  }
}

