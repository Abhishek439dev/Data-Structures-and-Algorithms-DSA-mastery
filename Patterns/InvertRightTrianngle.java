package com;

public class InvertRightTrianngle {
//This program prints inverted right angle triangle pattern of *
//There can be multiple ways to print this pattern.

	//1) First way.
	void PrintInvert(int n){
		
		for(int i = 0; i<n; i++) {
			for(int j = n; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//2) Second way.
	void PrintInvert2(int n){
		
		for(int i = 0; i<=n; i++) {
			for(int j = 1; j <= (n-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//3) Third way.
	void PrintInvert3(int n) {
		for(int i =0; i<n; i++) {
			for(int j = i; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		InvertRightTrianngle IRT = new InvertRightTrianngle();  //Object creation
		//Methods called
		IRT.PrintInvert(4);
		System.out.println();
		IRT.PrintInvert2(4);
		System.out.println();
		IRT.PrintInvert3(4);
		}
}
/*

****
***
**
*

****
***
**
*


****
***
**
*

*/

