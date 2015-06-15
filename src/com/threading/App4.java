package com.threading;

import java.util.Scanner;


class Processor extends Thread{
	
	
	private volatile boolean running = true;
	
	@Override
	public void run(){

		while(running){
			
			System.out.println("Hello");
			try{
				  Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.err.println("shutting down");
	}
	
	
	public void shutdown(){
		
		running = false ;
	}
}

public class App4 {

	public static void main(String args []){
		
		Processor p1 = new Processor();
		
		p1.start();
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.close();

		p1.shutdown();
	}
  
}
