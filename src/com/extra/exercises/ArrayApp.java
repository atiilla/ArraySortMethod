package com.extra.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayApp {
	
	public static void main(String[] args) {
			IntArrayTools arr = new IntArrayTools();
		 int ar[] = {5,3,5,6,7};
         System.out.println(arr.isSorted(ar)); 
      
         int[] myArray = { 5, 2, 7, 3, 9, 1, 4, 11 };
         arr.sort(myArray);
	}

}
