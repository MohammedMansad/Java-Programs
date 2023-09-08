package com.abc;

import java.util.Arrays;

public class MinNumStack {
	public static int arr[] = null;

	MinNumStack() {

		// Initialize your data structure here
		arr = new int[3];
	}

//[0]=2

	// Should push item on top of the stack

	public void push(int i) {
		int index = 0;
		while (true) {// 7
			if (arr[index] == 0) {// arr[1]==0 true .
				arr[index] = i;// arr[1]=7
				break;
			}
			++index;

		}

	}

	// Should remove item from top of the stack

	public void pop() {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				index = i;
			}

		}
		
		arr[index]=0;
	}

	// Should return the top item from stack without removing it

	public int top() {
		int topVal = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				topVal = arr[i];
			}

		}
		return topVal;

	}

	// Should return the smallest item from the stack

	public int min() {
		int min=0;
		int[] copyOf = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copyOf);
		for (int i = 0; i < copyOf.length; i++) {
			if (copyOf[i] != 0) {
				min = copyOf[i];
				break;
			}

		}
		
		return min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinNumStack minNumber = new MinNumStack();

		minNumber.push(2);

		minNumber.push(7);

		minNumber.push(-1);

		System.out.println(java.util.Arrays.toString(arr));
		System.out.println(minNumber.top()); // Should print -1

		 System.out.println("MIn   "+minNumber.min()); // Should print -1
		  
		 minNumber.pop();
		  
		 System.out.println(java.util.Arrays.toString(arr));
		 System.out.println(minNumber.top()); // Should print 7
		 
		  System.out.println(minNumber.min()); // Should print 2
		 
		  minNumber.push(-2);
		  System.out.println(java.util.Arrays.toString(arr));
		  System.out.println(minNumber.min()); // Should print -2
		 

	}

}
