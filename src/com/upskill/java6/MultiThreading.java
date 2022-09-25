package com.upskill.java6;

public class MultiThreading {

	
	
public static void main(String [] args){
	int n = 2;
	
for (int i = 0; i < n; i++) {
}
}
}
class MultitheadingDemo extends Thread{
	public void run(){
		try{
			System.out.println("Thread" + Thread.currentThread().getId()+ "is running");
		} catch (Exception e){
			System.out.println ("Exception is caught");
		}
	}
}





