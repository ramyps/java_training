/**
 * 
 */
package com.java.code30days.challenge.hackerrank;

/**
 * @author Ramy
 *
 */
import java.util.*;
import java.io.*;
class Nod{
    Nod left,right;
    int data;
    Nod(int data){
        this.data=data;
        left=right=null;
    }
	public int cardinality() {
		// TODO Auto-generated method stub
		return 0;
	}
}
class Day22_BinarySearchTrees{

	public static int getHeight(Nod root){
	    Nod left = null,right = null;

		
		return 1+left.cardinality()+right.cardinality();
      //Write your code here
    }

    public static Nod insert(Nod root,int data){
        if(root==null){
            return new Nod(data);
        }
        else{
            Nod cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Nod root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}