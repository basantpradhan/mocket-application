package com.threading;

import java.util.Scanner;

public class WaitNotifyExample {

	
	public void  produce() throws InterruptedException {
		
		synchronized (this) {
			
			System.out.println("produce thread running...");
			
			/* its wait , its not uses system resources, waiting for notify
			 * release monitor lock
			*/
			wait();
			System.out.println("Resumed..");
		}
	}
	
	public  void consume() throws InterruptedException {
		
		
		Scanner scan = new Scanner(System.in);
		Thread.sleep(2000);
		
		synchronized (this) {
			
			System.out.println("Wating for return key pressed....");
			scan.nextLine();
			scan.close();
			System.out.println("Return key pressed...");
			notify();
			
			// sleep doesn't release the lock
			Thread.sleep(2000);
		}
	}
	
	public static void main(String args []) throws InterruptedException{
		
		final WaitNotifyExample w = new WaitNotifyExample();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
		      		
				try {
					w.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
		      		
				try {
					w.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}
	
}
