package com.basant;

public class Testme {

	
	public void rec(int a){
		
		if(a>=1){
			
			rec(a-1);
			System.out.println(a);
		}
	}
	
	
	public static void main(String args []){
		
		new Testme().rec(3);
	}
}