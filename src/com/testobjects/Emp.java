package com.testobjects;

public class Emp implements Comparable<Emp> {

	private String name;
	private int id;
	
	
	public Emp(String name , int id) {
		
		this.name = name ;
		this.id = id ;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(Emp o) {
		
		return this.name.compareTo(o.name);
		
	}
	
	
}
