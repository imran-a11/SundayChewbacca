package com.upskill.assigment_1;

/*Problem 03: A function which returns the multiply value of a and b where a = 9 and b = 11.
Write a program which will display addition of a +b + function returns value. */




public class Problem3 {
public static void main(String[] args){
	
	int a=9;
	
	int b=12;
	
	int multiplicationValue = multiplyFunction(a,b);
	
	System.out.println("The Result is : " + (a+b+multiplicationValue));
	

}
public static int multiplyFunction(int a, int b)
{return a*b;
}


}
 