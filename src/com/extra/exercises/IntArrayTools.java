package com.extra.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IntArrayTools<myArray> {

	public static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false; // It is proven that the array is not sorted.
			}
		}

		return true; // If this part has been reached, the array must be sorted.
	}
	
	
	public <Int> void sort(int a[]) {
		
		Arrays.sort(a);
        System.out.println(Arrays.toString(a));
		
	}

}
