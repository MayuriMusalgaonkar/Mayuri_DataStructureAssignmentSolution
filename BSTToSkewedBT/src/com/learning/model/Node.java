package com.learning.model;


public class Node {

		public int val;
		public Node left, right;
		
		//  function that allocates a new node		
		public Node(int item)
		{
			val = item;
			left = right = null;
		}
	
}
