package com.upskill.java3;

public class Loopsjava {

	/*Type of Loops
	 1. For Loop
	 2.White Loop
	 3.Do While Loop
	 4.Infinite Loop
	 */
	
	public static void  main (String []ags) {
	//	practiceForLoop();
	//	practiceWhileLoop();
		//praticeDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedLoop();
	}
	
public static void 	practiceForLoop(){          // For loop= Do again and again upto upper limit//
	int i;
	for (i = 1; i <= 100; i++){
		System.out.println("For Loops Number = " + i);
	}
	
}
public static void practiceWhileLoop(){     //While loop -Do again and again upto condition match
int i = 1;
while(i<=10){
	System.out.println("While Loops Number = " + i);
	i++;
        }
  }

public static void praticeDoWhileLoop(){    //Do while Loop - Do action then match condition
	int i = 1;                             //Initialize the variable 
	do{
		System.out.println("Do While Loops Number = " + i);
		i++;
	}while (i<=10);
}
public static void practiceInfiniteLoop(){     //Infinite Loop - Never ending loop 
int i = 1;
for (i = 1; ; i++){
	System.out.println("For Loops Number = " + i);
	    }
    }

public static void practiceNestedLoop(){
	int i;
	int j;
	for(i =1; i <=10; i++){
		for(j = 1; j <=10; j++){
			int multiplicationTable = i * j;
			System.out.print(multiplicationTable + " ");
		}
		System.out.println(" ");
	        }
	
      }

}
