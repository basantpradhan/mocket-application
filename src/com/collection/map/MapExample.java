package com.collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.testobjects.Dummy;

public class MapExample {

	public static void main(String args []){
		
		new MapExample().example();
	}
	
	
	public void example(){
		
		Map<String,Dummy>map = new TreeMap<String,Dummy>();
		
		map.put("one",new Dummy());
		
		
		//# way::1
		Iterator<Map.Entry<String,Dummy>> itr = map.entrySet().iterator();
		while(itr.hasNext()){
			
			Map.Entry<String, Dummy> entry = itr.next();
			System.out.println(entry.getKey());
		}
		
		
		//# way::2
		
	}
}
