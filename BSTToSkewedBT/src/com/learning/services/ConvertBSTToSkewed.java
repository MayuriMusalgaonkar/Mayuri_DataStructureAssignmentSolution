package com.learning.services;

import com.learning.model.Node;

public class ConvertBSTToSkewed {
	
	public static Node prevNode = null;
	public static Node headNode = null;

	// Function to Convert the binary search tree into a skewed tree in ascending order
	public static void convertBTToSkewed(Node root,
								int order)
	{
	
		// when root is null
		if(root == null)
		{
			return;
		}
	
		// Condition to check the order in which the skewed tree to maintained
		if(order > 0)
		{
			convertBTToSkewed(root.right, order);
		}
		else
		{
			convertBTToSkewed(root.left, order);
		}
		Node rightNode = root.right;
	
		// Condition to check if the root Node of the skewed tree is not defined
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		//  recurse for the  right subtree on the basis of the order required
		
		convertBTToSkewed(rightNode, order); 
	}

	// Function to traverse the right skewed tree using recursion
	public static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);	
	}
}
