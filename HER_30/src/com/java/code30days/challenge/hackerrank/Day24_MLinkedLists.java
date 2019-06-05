/**
 * 
 */
package com.java.code30days.challenge.hackerrank;

/**
 * @author Ramy
 *
 */

import java.io.*;
import java.util.*;
class Node1{
	int data;
	Node1 next;
	Node1(int d){
        data=d;
        next=null;
    }
	
}
class Day24_MLinkedLists
{

    public static Node1 removeDuplicates(Node1 head) {
		return head;
      //Write your code here

    }

	 public static  Node1 insert(Node1 head,int data)
     {
        Node1 p=new Node1(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node1 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node1 head)
        {
              Node1 start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node1 head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }