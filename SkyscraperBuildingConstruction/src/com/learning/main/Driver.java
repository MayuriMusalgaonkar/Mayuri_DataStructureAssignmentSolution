package com.learning.main;

import com.learning.services.FloorConstruction;

public class Driver {	
	
	public static void main(String[] args) {
		
		//Call function to insert and print the order of construction of floor
		FloorConstruction floorConstruction = new FloorConstruction();
		
		floorConstruction.insertValue();

	}

}
