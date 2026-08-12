package com;

public class HalfSpindle {
	
	void PrintTriangle(int n) {
		for (int i =0; i<=n; i++) {
			for(int j =0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
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

