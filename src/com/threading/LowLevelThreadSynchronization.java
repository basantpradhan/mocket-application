package com.threading;

import java.util.LinkedList;
import java.util.Random;

public class LowLevelThreadSynchronization {

	
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final static int LIMIT = 10;
	
	private final Object lock = new Object();
	
	public void produce() throws InterruptedException{
	
		int value = 0;
		
		while(true){
			synchronized (lock) {
				
				while(list.size()==LIMIT){
					lock.wait();
				}
				list.add(value++);
				lock.notify();
			}
		}
	}
	
	
	public  void consume() throws InterruptedException{
		
		Random random = new Random();
		
		
		while(true){
			
			synchronized (lock) {
				
				while(list.size()==0){
					lock.wait();
				}
				
				System.out.print("List size :"+list.size());
				int value = list.removeFirst();
				System.out.println(" removed value "+value);
				lock.notify();
			}
			
			Thread.sleep(random.nextInt(1000));
		}
	}
	
	
	
	/*
	 *   main method
	 */
	
	public static void main(String args []) {
		
		
		final LowLevelThreadSynchronization obj = new LowLevelThreadSynchronization();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				try {
					   obj.produce();
					   
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				try {
					   obj.consume();
					   
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
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
		
		
		
	}
}
