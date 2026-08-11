package com;

public class NumberTriangle {
//This program has a method that prints a right angle triangle of numbers starting from 1 in each line.
	public void PrintNumberTriangle(int n) {
		
		for(int i = 1; i<=n; i++) {      //outer loop: i =1 as line should start from 1. 
			for(int j = 1; j<=i; j++) {  //Inner loop: j = 1 as each line should start from 1 and in each line we have to go until the line no.'i' (3rd line: 1 2 3).
				System.out.print(j);     //In each line we have to print value of j starting from 1.
			}
			System.out.println();   //next line.
		}
		
	}
	public static void main(String[] args) {
		NumberTriangle NT = new NumberTriangle();  //object creation.
		NT.PrintNumberTriangle(4);   //method calling
	}
}

/*
Output
1
12
123
1234
*/
