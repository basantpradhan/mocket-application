package com.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 
 * ############ Thread pool ######################
 * Thread pool is used to manage number of thread.
 * Thread pool has a special managerial thread. for submitting task and start and complete tasks.
 * 
 * Thread pool is like having a number of workers in  a factory , we can allocated task to factory. each of these worker/thread
 * finishes the task.
 * 
 * 
 *
 */
public class ThreadPool  {

	public static void main(String args []){
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
	   
		for(int i=1;i<7;i++)
			executor.submit(new App(i));
		
		executor.shutdown();
		try {
			executor.awaitTermination(400,TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println("Main thread completed");
	}
}


class App extends Thread{
	
	int id ;
	
	public App(int id){
	
		this.id  = id ;
	}
	
	@Override
	public void run(){
		
		System.out.println("starting id.."+id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("completed id.."+id);
	}
}
