package com.upskill.java3;

public class constructor {

	String studentName;
	int studentAge;
	
public	constructor(String name, int age){
	studentName=name;
	studentAge=age;
	}
	
public static void main(String[] args){
	
	constructor obj = new constructor("Imran" , 25);
	System.out.println(obj.studentName);
	System.out.println(obj.studentAge);


   }

}
