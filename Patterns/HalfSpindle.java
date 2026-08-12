package com;

public class HalfSpindle {
//To print half spindle we can print half upright right traingle and then half inverted rihht angle triangle.
	
	void PrintTriangle(int n) {
		//Printing half upright triangle 
		for (int i =0; i<=n; i++) { 
			for(int j =0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//Printing half inverted triangle.
		for(int i =0; i<n; i++) {
			for(int j = i; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		HalfSpindle HS = new HalfSpindle();
		HS.PrintTriangle(4);
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

