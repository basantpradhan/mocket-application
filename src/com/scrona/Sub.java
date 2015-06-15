package com.scrona;

 class Sample {

	public void print(){
		
		System.out.println("super-print");
	}
public void print2(){
		
		System.out.println("super-print");
	}
	
	public void print(boolean f){
		
		if(f)
			print2();
		else
		{
			
		}
	}
 }	
	public class Sub extends Sample{
		
		public void print(){
			
			System.out.println("child-print");
		}
		
		
		public static void main(String args[]){
			
			Sub s = new Sub();
			
			s.print();
			s.print(true);
		}
	}

