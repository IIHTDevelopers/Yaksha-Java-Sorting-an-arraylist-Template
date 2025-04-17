package com.yaksha.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingOperations {

	public static void main(String[] args) {
		// **Creating an ArrayList**
		ArrayList<Integer> arrayList = new ArrayList<>();

		// **Adding items to ArrayList**
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(2);
		System.out.println("ArrayList after adding items: " + arrayList);

		// **Sorting ArrayList in ascending order**
		Collections.sort(arrayList);
		System.out.println("ArrayList after sorting in ascending order: " + arrayList);

		// **Sorting ArrayList in descending order**
		Collections.sort(arrayList, Collections.reverseOrder());
		System.out.println("ArrayList after sorting in descending order: " + arrayList);

	}
}
