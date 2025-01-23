package com.pixated.canopy.ArrayTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class D_Dupli_Position {
	@Test
	public void printDuplicatePositionsWithMap() {
	    int[] arr = {1, 2, 3, 2, 4, 5, 6, 3, 7, 1, 2};
	    Map<Integer, List<Integer>> map = new HashMap<>();
	    for (int i = 0; i < arr.length; i++) {
	        map.putIfAbsent(arr[i], new ArrayList<>());
	        map.get(arr[i]).add(i);
	    }
	    for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
	        if (entry.getValue().size() > 1) { 
	        	System.out.println("Duplicate element: " + entry.getKey() + " found at positions " + entry.getValue());
	        }
	    }
	}
	@Test
	public void printDuplicatePositionsWithMap1() {
	    int[] arr = {1, 2, 3, 2, 4, 5, 6, 3, 7, 1,4, 2};
	    Map<Integer, List<Integer>> map = new LinkedHashMap<>();
	    int index = 0; // Counter to track the index

	    for (int value : arr) { // For-each loop
	        map.putIfAbsent(value, new ArrayList<>());
	        map.get(value).add(index); // Add the index of the element
	        index++; // Increment the index
	    }

	    for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
	        if (entry.getValue().size() > 1) {
	            System.out.println("Duplicate element: " + entry.getKey() + " found at positions " + entry.getValue());
	        }
	    }
	}

}

