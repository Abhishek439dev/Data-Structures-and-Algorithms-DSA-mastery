package com;

public class HalfSpindle {
//To print half spindle we can print half upright right traingle and then half inverted rihht angle triangle.
	
	void PrintTriangle(int n) {
		//Printing half upright righnt angle triangle 
		for (int i =0; i<=n; i++) {        //Outer loop
			for(int j =0; j<=i; j++) {     //Inner loop
				System.out.print("*");     //Printing star
			}
			System.out.println();          //new line
		}

		//Printing half inverted right angle triangle.
		for(int i =0; i<n; i++) {        //Outer loop
			for(int j = i; j<n; j++) {   //Inner loop
				System.out.print("*");   //Printing star
			}
			System.out.println();        //new line
		}
	}
	
	public static void main(String[] args) {
		HalfSpindle HS = new HalfSpindle();      //Object creation
		HS.PrintTriangle(4);                   //Method called.
	} 

}


/*

*     i=1
**    i=2
***   i=3
****  i=4
****  i=1 
***   i=2
**    i=3
*     i=4

 */

