package com.upskill.java6;

public class Singleton {
	
	//private constructor,it prevents any other class from instanting
	
	private Singleton(){
		
	}
	
	
	//private static object of the class
	
	private Singleton singletonobj = new Singleton();
	
	//public satic instance methord
	
	public static Singleton getInstance(){
		
	
	}
	
protected static  void upskill(){
	System.out.println("Upskill methord from Singletone class");
}
}