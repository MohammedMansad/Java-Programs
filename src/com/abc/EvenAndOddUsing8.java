package com.abc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddUsing8 {

	public static void main(String[] args) {


		
		List<Integer>number=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer>Oddnumber=number.stream().filter(x-> x%2!=0).collect(Collectors.toList());
		List<Integer>evennumber=number.stream().filter(y-> y%2==0).collect(Collectors.toList());
		
		System.out.println(evennumber);
		System.out.println(Oddnumber);

	}

}
