package com;

public class AlternateOneZero {
//This program prints alternate number traingle
	void PrintTriangle(int n) {
		
		for(int i =1; i<=n; i++) {
			
			int Start = 1;
			if(i%2 == 0){
				Start = 0;
			}
			for(int j = 0; j<i; j++) {
					System.out.print(Start);
					Start = 1-Start;
				}
			System.out.println();
			}
		
		}
		
	
	public static void main(String[] args) {
		AlternateOneZero AOZ = new AlternateOneZero();
		AOZ.PrintTriangle(6);
		
	}
}



/*
 
 1     i=1
 01    i=2
 101   i=3
 0101  i=4
 10101 i=5
 
 */
 
