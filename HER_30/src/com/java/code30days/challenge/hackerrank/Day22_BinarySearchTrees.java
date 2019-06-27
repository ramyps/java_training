/**
 * 
 */
package com.java.code30days.challenge.hackerrank;

/**
 * @author Ramy 
 * 7
3
5
2
1
4
6
7
Expected OutputDownload
3
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
		 int heightLeft = 0;
		    int heightRight = 0;

		    if (root.left != null) {
		        heightLeft = getHeight(root.left) + 1;
		    }
		    if (root.right != null) {
		        heightRight = getHeight(root.right) + 1;
		    }

		  return (heightLeft > heightRight ? heightLeft : heightRight);
	
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


/*
 * First I did the same seperate null checks for both (root.left) and (root.right). It worked just fine. Mine was even more crowded, checking every combination of null state for left and right couple. Then I wanted to shorten this a bit and added (root!=null) condition at the beginning, since each node (left or right) becomes root at one point. It turned out shorter like that:

public static int getHeight(Node root){
    if(root != null){
        return Math.max(1+getHeight(root.left), 1+getHeight(root.right));
    } else{
        return -1;
    }
}
Returning -1 is important (discovering that one was painful). Because we have (1 + getHeight()), and moving on to a new node will result in height of 1 (1+0) even it does not have any child nodes (a.k.a. height for this code). In other words, if this code reaches a new child node, it adds 1 to the height automatically. But it also adds 1 when it processes the very first root node at the top. That is why we need to return -1 when the node is null, to subtract what we added for that node with (1 + ) in the previous recursion. Hope that makes sense. Just wanted to share. Happy coding!

(Edit: Realising now this was also in editorial I guess..)
 */