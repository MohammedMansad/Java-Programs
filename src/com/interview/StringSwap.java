package com.interview;

public class StringSwap {

	public static void main(String[] args) {
		
		
	String s="Mohammed Mansadd";
//Omahmmde
//word swap each other
//Mansad-->aMsnda
	//1 index swap & second last index swap	
		//output -Omahmmde aMsnda
	
	
	String split[]=s.split(" ");
	
	for (int i = 0; i < split.length; i++) {
		String word = split[i];
		String wordPrirnt="";
		String[] charArrayFirstWord = word.split("");
		for (int j = 0; j < charArrayFirstWord.length-1; j++) {
			wordPrirnt=charArrayFirstWord[j+1]+""+charArrayFirstWord[j];
			//System.out.println(charArrayFirstWord[j]);
			System.out.print(wordPrirnt);
			j++;
		}
		
		if(charArrayFirstWord.length%2!=0) {
			System.out.println(charArrayFirstWord[charArrayFirstWord.length-1]);	
		}
		
		System.out.println();
		
	}
	
//	String firstWord=split[0];
//	String secondWord=split[1];
//	char[] charArrayFirstWord = firstWord.toCharArray();
	
//	char temp=charArrayFirstWord[0];
//	charArrayFirstWord[0]=charArrayFirstWord[1];//0=O
//	charArrayFirstWord[1]=temp;//1=m
	
	
	///charachter count
	
	//String[] split2 = s.split("");
	

	}

}
