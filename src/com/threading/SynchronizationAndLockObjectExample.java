package com.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * 
 * Transient or incentive(not sure about name) or Monitor lock has to get by thread while executing synchronized block or method.
 *
 */

public class SynchronizationAndLockObjectExample {

	/*
	 * Its good practice to declared non manipulated object for locking, to avoid possible confusion 
	 * 
	 * here we can use list1 and list2 as locking , 
	 * 
	 */
	private Object obj1 = new Object();
	private Object obj2 = new Object();
	
	
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	private Random random = new Random();
	
	
	
	public  void stageOne(){
		
		synchronized (obj1) {
			
			try{
				Thread.sleep(1);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
		
	}
	
	public  void stageTwo(){
		
		synchronized (obj2) {
			
			try{
				Thread.sleep(1);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
		
	}
	
	public void process(){
		
		for(int i=0;i<1000;i++){
			
			stageOne();
			stageTwo();
		}
	}
	
	public static void main(String args []){
		
		
		final SynchronizationAndLockObjectExample obj = new SynchronizationAndLockObjectExample();
		System.out.println("starting ....");
		double start = System.currentTimeMillis();
		
		Thread t1 =   new Thread(new Runnable() {
			@Override
			public void run() {
				obj.process();
			}
		});
		
		Thread t2 =   new Thread(new Runnable() {
			@Override
			public void run() {
				obj.process();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		double end = System.currentTimeMillis();
		
		
		System.out.println("Time "+(end-start));
		System.out.println("List1.size "+obj.list1.size());
		System.out.println("List2.size "+obj.list2.size());
		
		System.out.println(obj.list1);
		
		
	}
	
	
}
