package com.abc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateUsingJ8 {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,56,7,8,2,3);
		HashSet<Integer>set=new HashSet<>();
		numbers.stream().filter(x->set.add(x)).forEach(System.out::println);
		
		
	}
}
