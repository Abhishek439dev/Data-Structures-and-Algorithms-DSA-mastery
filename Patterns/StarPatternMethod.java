package com;
//This program has a method which prints a n*n star pattern upon calling with an integer argument.
public class StarPatternMethod {
	//method
	public void PrintStarPattern(int n) {
		for(int i = 0; i<n; i++) {        //outer loop determine no. of lines
			for(int j = 0; j<n; j++) {    //inner loop prints lines
				System.out.print("*");
			}
			System.out.println();  //shifting to next line.
		}
	}

	//main method
	public static void main(String[] args) {
		
		StarPatternMethod SPM = new StarPatternMethod();   //object creation
		SPM.PrintStarPattern(4);                           //method calling with argument.
	}
}

/*
Output
****
****
****
****
*/
