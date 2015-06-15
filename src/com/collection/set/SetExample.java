package com.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public  static void main(String args []){
	
		SetExample e = new SetExample();
		e.hashSetExample();
		
	}
	
	public void hashSetExample(){
		
		Set<Integer> set = new LinkedHashSet<>();
		
		System.out.println(set.add(210));
		System.out.println(set.add(210));
		
		System.out.println(set.add(120));
		System.out.println(set.add(109));
		System.out.println(set.add(110));
		System.out.println(set.add(null));
		System.out.println(set.add(null));
		
		
		System.out.println(set);
		
	}
}
