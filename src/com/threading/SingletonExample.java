package com.threading;

public class SingletonExample {

public static void main(String args []){
		 
		 Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				int count = Singleton.getSingletonInstance().getCountValue();
				System.out.println(count);
			}
		});
		 
		 
		 Thread t2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
				
					int count = Singleton.getSingletonInstance().getCountValue();
					System.out.println(count);
				}
			});
		 
		 t1.start();
		 t2.start();
		 
		 try{
			 
			   t1.join();
			   t2.join();
			   
		 }catch(InterruptedException e){
			 
		 }
	}
}


class Singleton{
	
	private int count = 100;
	private static volatile Singleton singleton  = null ;
	
	public static Singleton getSingletonInstance(){
		
		if(singleton==null){
			synchronized (Singleton.class) {
				if(singleton==null){
					singleton = new Singleton();
					System.out.println("NEW OBJECT CREATED AND RETUREND");
				}else{
					
					  System.out.println("OLD OBJECT RETURED");
				}
			}
		 }
		
		  return singleton;
	}
	
	
	 public int getCountValue(){
		
		return count ;
	}
	
}