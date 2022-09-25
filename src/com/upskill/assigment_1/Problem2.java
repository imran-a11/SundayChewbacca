package com.upskill.assigment_1;

public class Problem2 {

public static void main(String[] args) {
		
	    //	Formula of rectangle 	2*(a + b) 
		
        /*Problem 01: A rectangle width and length are: 9 and 13 inches.
	   Write a method to display the perimeter of rectangle in console output. */	
	
	Rectangle();
	

	Problem2 obj = new Problem2();
	obj.Rectangle2();


}
	
	//Static Method:	
	
	public static void  Rectangle(){
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
		System.out.println("Static : The perimeter of rectangle is " + c);
	}
		
		//nonStatic Method:
		
	public void Rectangle2(){
		int a = 9;
		int b = 13;
	     int c = 2*(a+b);
	     System.out.println("nonStatic:The perimeter of rectangle is" + c);
	}
	
	
	
	
}
	
	

