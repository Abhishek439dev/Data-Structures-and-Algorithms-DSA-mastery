package com;

public class SameNoTriangle {
//In this program we have to print a numbered right angle triangle but each line should have repetition of its line number only.
		public void PrintSameNumberTriangle(int n) {
			
			for(int i = 1; i<=n; i++) {  //outer loop: necessary to start from 1 otherwise the first iteration will not occur. It determines line number.
				for(int j = 1; j<=i; j++) {  //Inner loop: allowed to print only until the line number(i). It iterates 1 time if i =1 and two times if i =2.
					System.out.print(i);   //We are printing value of i(line number) in each iteration of inner loop, resulting in printing of same number.
				}
				System.out.println(); //next line.
			}
			
		}
		public static void main(String[] args) {
			SameNoTriangle NT = new SameNoTriangle();  //object creation
			NT.PrintSameNumberTriangle(4);  //method called
		}
	}


/*
Output
1
22
333
4444
*/
