package com.upskilljava4;

import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {
	
	public static void main(String [] args){
		// Array store multipul data using index
		
		int age =30;              //Variable
		
		int[] ageChewbacca = new int []{24, 45, 29, 35, 33, 28}; //Array
		//Array Index                    0   1   2   3   4   5

		
		int[] Bnagladesh = new int []{20, 25, 26};
System.out.println("Sectorname :" + Bnagladesh [2] );

String [] WeThree = new String [] {"Hasan","Riaz","Rony"};
System.out.println("The best student is : " + WeThree[1] );
		
		
		
		
		System.out.println("Student Age :" + ageChewbacca[5]);
	
	String[] nameChewbacca = new String []{"imran" , "Rasel", "Alex","Mamun", "Jahid"};
	//Array Index                              0        1        2      3        4   
	
	System.out.println("Student Name :" + nameChewbacca[4]);
	
	System.out.println("Total Student  :" + nameChewbacca.length);
	
	//Multi-Dimentional Array
	
	int[][] ageChewbacca2D = {{24, 45, 29, 35, 33, 28},  //[0][0]  [0][1] [0][2] [0][3] [0][4] [0][5]
			{24, 45, 28}};                             //  [1][0]  [1][1] [1][2]
	int[][] ageWeThree2d=

	System.out.println("Student Age 2D :" + ageChewbacca2D[0][0]);
	
	// Hasmap store multipul data using key value pair,Implementation of map interface 
	
	HashMap<String, Integer> Student = new HashMap<String, Integer>();
	Student.put("imran", 24);
	Student.put("Rasel", 45);
	Student.put("Alex", 29);
	Student.put("Mamun", 35);
	Student.put("Jahid", 33);
	
	System.out.println(" Student Age  :" + Student.get("Alex"));
	
	HashMap<String, String> Capital = new HashMap<String, String>();
	
	Capital.put("BD", "Dhaka");
	Capital.put("Canada", "Toronto");
	System.out.println("Capital City : " + Capital.get("BD"));
	
	HashSet<String> car = new HashSet< String>();
	car.add("BMW");
	car.add("Audi");
	car.add("Toyota");
	System.out.println(" Car :" + car);
	
	
	
	
	}
	
}


