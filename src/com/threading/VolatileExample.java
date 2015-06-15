package com.threading;


/**
 *
 * volatile and join example
 */
public class VolatileExample {
	
	/**
	 *
	 * Tell JAVA VIRTUAL MACHINE TO READ VALUE FROM MAIN MEMORY NOT CPU CACHE.
	 */
	public volatile int count ; 
	
	public static void main(String args []) throws InterruptedException{
		
		VolatileExample v = new VolatileExample();
		v.dowork();
	}
	
	public synchronized void  increment(){
		count = count + 1;
	}
	
	/**
	 * doWork() method
	 * @throws InterruptedException 
	 */
	
	public void dowork() throws InterruptedException{
		
		Thread t1 =  new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10000;i++)
					increment();
			}
		});
		
		Thread t2 =  new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10000;i++)
					increment();
			}
		});
		
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	
		System.out.println("count ::"+count);
	}
}
