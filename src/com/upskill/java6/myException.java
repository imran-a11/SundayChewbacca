package com.upskill.java6;

public class myException extends Exception {

	String a;
	
	public myException (String b){
		a=b;
	}
	
	public String upskill(){
		return a;
	}
}
