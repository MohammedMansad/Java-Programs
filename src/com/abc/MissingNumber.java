package com.abc;

public class MissingNumber {

	public static void main(String[] args) {
		
	
	int arr[]= {1,3,4,5,6,7,8,9,11,12,13,14,16,18};
	int count=1;
	
	for (int i : arr) {
		if(i!=count) {//1!=1 //2!=3 //3!=2
			System.out.println(count);
			++count;//3
		}
		++count;//2	
	}
	
	
	
	
	
	
	
	
//	///////////////////////////////////////////////////////
//	int sum=((arr.length+1)*((arr.length+1)+1))/2;
//	//n(n+1)/2
//	//System.out.println(sum);
//	int actualsum=0;
//	for (int i = 0; i < arr.length; i++)
//	{
//		
//		actualsum=actualsum+arr[i];
//		
//	}
//	System.out.println("The missing number is:"+(sum-actualsum));
	
	}
}
