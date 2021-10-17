package com.learning.main;
// Java implementation to flatten the
// binary search tree into a skewed
// tree in increasing / decreasing order
import java.io.*;

import com.learning.model.Node;
import com.learning.services.ConvertBSTToSkewed;


public class Driver
{
	public static Node node;

	public static void main (String[] args)
	{
	//input BST	
	//               50
	//	        / \
	//            30   60
       //	     /     /
	//	    10   55
	
		
		 node = new Node(50);
		 node.left = new Node(30);
		 node.left.left = new Node(10);
		 node.right = new Node(60);		
		 node.right.left= new Node(55);
		 
	
		// Order of the Skewed tree can be 0 for ascending order -		
		int order = 0;
		ConvertBSTToSkewed.convertBTToSkewed(node, order);
		ConvertBSTToSkewed.traverseRightSkewed(ConvertBSTToSkewed.headNode);
	}
}

