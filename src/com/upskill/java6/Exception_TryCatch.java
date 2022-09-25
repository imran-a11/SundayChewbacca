package com.upskill.java6;

public class Exception_TryCatch {

public static void main(String[] args){
	
	//Built in exception ArrayIndex
	
	try {
		int[] ageChewbacca = new int[]{25, 26, 60, 45, 55, 35};
		System.out.println("Student Age : " + ageChewbacca[6]);
	} catch (Exception e){
		System.out.println("Array Index not available");
		e.printStackTrace();
	}
	

//Specific built in Exceptions -Number FormatException

try{
	int num = Integer.parseInt("Test");
	System.out.println("Value of num int = " + num);
} catch (NumberFormatException e){
	System.out.println("Please enter a valid number");
	e.printStackTrace();
	}

// user Define Exception 
try {
	throw new myException("Test");
}catch (myException e){
	System.out.println("User Define Exception");
	e.printStackTrace();
}
finally{
	System.out.println("Test Execution completed");
}
}
}