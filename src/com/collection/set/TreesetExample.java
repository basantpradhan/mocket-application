package com.collection.set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.testobjects.Emp;
import com.testobjects.Student;

public class TreesetExample {

	public static void main(String args []){
		
		new TreesetExample().treesetexample();
	}
	
	
	public void treesetexample(){
		
		SortedSet<Emp> set = new TreeSet<Emp>();
		
		
		for(int i=1;i<6;i++){
			
			Emp e = new Emp("Ram-"+i,i*10-10);
			
			set.add(e);
			
			
		}
		
		
		 Iterator<Emp> itr = set.iterator();
		  
		 while(itr.hasNext()){
			 
			 Emp e = itr.next();
			 System.out.println(e.getName());
		 }
	
		
	}
	
	
	public void comparatorExample(){
		
    SortedSet<Student> set = new TreeSet<Student>();
		
		
		for(int i=1;i<6;i++){
			
			Student s =  new Student();
			
			s.setName("Ram-"+i);
			s.setAge(i);
			s.setSalary(i*120.50);
			
			set.add(s);
			
		}
	}
	
	
}
