package com.learning.model;

import java.util.Comparator;

//creates the comparator for comparing Floor value
	public class FloorSizeComparator implements Comparator<Floor> {
	  
	    // override the compare() method
	    public int compare(Floor f1, Floor f2)
	    {
	    	return f2.size - f1.size;
	    }
	}