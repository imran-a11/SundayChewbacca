package com.upskill.java_5;

public class Encapsulation {

	
//Encapsulation used to hide the data
	
private String name = "abc";  //Write & read
private int ssn = 51245615;       //write only 
private String username = "upskill";//read only
	
// Setter Methord -name its all always void method 	
	
	public void setName(String value){ //set the data,write
	name = value;
}
	
//getter Method -name 
public String getName(){       //get the data,read
	return name;
}
	public void setSSN(int value){ 
		ssn = value;
	
   }
	
	public String getUsername(){       
		return username;}	
	

public static void main(String[] args) {
	Encapsulation obj = new Encapsulation();
	obj.setName ("imran");
	System.out.println(obj.getName ());
	obj.setSSN(51245615);
	System.out.println(obj.getUsername ());
	
	
	
}
}