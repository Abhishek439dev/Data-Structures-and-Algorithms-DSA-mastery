package com;

public class AlternateOneZero {
//This program prints alternate numbered pattern traingle pf zeros and ones.
	void PrintTriangle(int n) {
		
		for(int i =1; i<=n; i++) {  //Outer loop: determining the line number(i).
			int Start = 1;  //declared a variable initialized to 1.
			if(i%2 == 0){   //checking if the current iteration of 'i' (line number) is even or not.
				Start = 0;  //If the current line number is even, only then set the value of Start to zero.
			}
			for(int j = 0; j<i; j++) {  //ineer loop: prints the lines.
					System.out.print(Start);  //If the line number is odd, print the value of start(which is 1).
					Start = 1-Start;    //This line changes the value of Start after each print, resulting in an alternating (101010) pattern.
				}
			System.out.println(); //New line
			}
		
		}
		
	
	public static void main(String[] args) {
		AlternateOneZero AOZ = new AlternateOneZero();  //Object creation.
		AOZ.PrintTriangle(6);  //Method calling.
		
	}
}



/*
 
 1     i=1
 01    i=2
 101   i=3
 0101  i=4
 10101 i=5
 
 */
 
