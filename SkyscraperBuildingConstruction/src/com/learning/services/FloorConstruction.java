package com.learning.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import com.learning.model.Floor;
import com.learning.model.FloorSizeComparator;

public class FloorConstruction {
	
	public int size, index, floorSize;
	static int i;

	 LinkedList<Floor> floors_array = new LinkedList<Floor>();
	 static Scanner sc = new Scanner(System.in);

	 //function to take input from user
	public void insertValue() { // when array is empty
		System.out.println("enter the total no of floors in the building");
		size = sc.nextInt();

		for (i = 0; i < size; i++) {

			Floor floor = new Floor();
			System.out.println("enter the floor size given on day :  " + (i + 1) + ": ");

			floorSize = sc.nextInt();

			if (floorSize != 0) { // check if inserted value is not 0

				floor.setDay(i + 1);
				floor.setSize(floorSize);
				floors_array.add(floor);

			} else {

				System.out.println("cannot use 0. Reserved for other purpose. Insert different value");

				i--;

			}

		}

		// sort linkedlist in reverse order

		Collections.sort(floors_array, new FloorSizeComparator());

		// printing output
		print();
	}
	
	// function to print output
		public void print() {
			System.out.println("The order of construction is as follows: ");
			System.out.println("\n");

			orderOfConstruction();

			floors_array.clear();
		}

		//function that traverse to linkedlist and find  the order of construction of floor
		public void orderOfConstruction() {
			/*
			 * 1 . start traversing the LinkedList. 
			 * 2. since the array is sorted in reverse order.. 
			 * 3. store the current day in variable curr_day; initially 0; 
			 * 4 . pick the current element, say e; 
			 * 5. if e.day > curr_day and 
			 *      if curr_day + 1 > 0
			 *        if ans.size() > 0
			 *          a. print the day and order of construction
			 *        print day if ans array is empty that meean no construction happen 
			 *    set curr_day to current element 
			 *    clear ans array
			 * 6.add current element size to ans array 
			 * 7.repeat 4, 5,6
			 * 
			 */

			int curr_day = 0;
			ArrayList<Integer> ans = new ArrayList<>();

			for (Floor obj : floors_array) {
				if (obj.day > curr_day) {

					if (curr_day + 1 > 0) {
						if (ans.size() > 0) {
							// System.out.println(curr_day +": " + ans.toString() + "\n");
							System.out.println("Day :" + curr_day);
							System.out.println(ans.toString());
						}
						_tempFun(obj.day, curr_day);
					}
					curr_day = obj.getDay();
					ans.clear();
				}
				ans.add(obj.getSize());

			}

			//if it is the last day then print the order of construction on that day
			if (ans.size() > 0)
				System.out.println("Day :" + curr_day);
			System.out.println(String.valueOf(ans));

		}

		//function to print the day when there will be no construction happen
		public void _tempFun(int obj_day, int curr_day) {
			for (int i = curr_day + 1; i < obj_day; i++) {
				System.out.println("Day :" + " " + i + "\n");
			}
		}

}