package com;
//This program prints a right angle triangle patern of stars upon providing an interger value.
public class RightAnglePattern {

	//method
	public void PrintRightAngleTriangle(int n) {
		for (int i = 0; i<n; i++) {               //outer loop determining each line (i = line number).
			for(int j = 0; j<=i; j++) {           //inner loop - In each line, No. of stars = No. of the line (2nd line = 2 stars) hence, j<=i where i = line number.
				System.out.print("*");            //prinitng stars.
			}
			System.out.println();                //next line
		}
	}
	public static void main(String[] args) {
		RightAnglePattern RAP = new RightAnglePattern();  //object-creation
		RAP.PrintRightAngleTriangle(4);                  //method called
	}
}

/*
Output
*
**
***
****
*/
