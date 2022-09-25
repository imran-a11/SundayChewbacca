package com.upskill.java_2;

public class ifElseStatementjava {

public static int age = 71;
	
	
	
public static void main(String[] args) {
	conditionalStaement();
}
	public static void conditionalStaement() {

	// If Else statement	
		if(age<13){
			System.out.println("You are children");
		}else if(age>13 && age>18){
			System.out.println("You are Teenager");
		}else if(age>65){
			
		//Nested if else statement
		if(age>100){
				System.out.println("You are Hero");
			}else{
			System.out.println("You are Senior");
			}
		}else{
			System.out.println("You are adult");
		}
		}
	
}
