package com.java8;

import java.util.HashMap;

public class exam {
	public static void main(String[] args) {
		String s="Mansadmmm";
		
		String[] split = s.split("");
		
		java.util.Map<String,Integer> map=new HashMap<>();
		
		for (int i = 0; i < split.length; i++) {
		//	list.add(split[i]);
			//System.out.println(split[i]);`
			
			if(!map.containsKey(split[i])) {
				map.put(split[i], 1);
			}else {
				Integer numCount = map.get(split[i]);
				//System.out.println(numCount);
				map.put(split[i], ++numCount);
			}
		}
		//map a 1
		//map a 2
		
		/*Set<String> set=new HashSet<>(list);
		
		System.out.println(set);
		for (String string : set) {
			unique=unique+string;
		}
		System.out.println(unique);
		
		*/
		System.out.println(map);
		
		
	}

}
