package com.collection.generics.demo;

import java.util.ArrayList;
import java.util.List;

public class Collection003 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(List.of(3,8,92,4,2,17,9));
		
		System.out.println("List : " + list);
		minToFront(list);
		System.out.println("Updated list : " + list);
	}
	
		public static void minToFront(ArrayList<Integer> array) {
		    int minIndex = 0;
		    
		    for (int i = 1; i < array.size(); i++) {
		        if (array.get(minIndex) > array.get(i)) {
		            minIndex = i;
		        }
		    }
	    
	    int minValue = array.remove(minIndex);
	    array.add(0, minValue);
	}
}

