package com.abc;

public class TestProgram {
	public static void main(String[] args) {
		int temp = 0;
		int a[]= {5,8,7,9,3,4,2};
	//5 8
		//5<8
		//8 5
		//
		
		for (int i = 0; i < a.length; i++) {//0  //1  //2
			 
			for (int j = i+1; j < a.length; j++) { //1  //2 //3
				
					if(a[i]<a[j])  //0<1 
					{
						temp=a[i]; //5
						a[i]=a[j]; //
						a[j]=temp;
					}
				
				
			}
			
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("The Second Element is:"+a[1]);
		
		
	}

	
}
