package com;

public class InvertedStarTriangle {

void PrintTriangle(int n) {
		
		for(int i = 1; i<=n; i++) {
			
			for(int j = 1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=((n-i)*2)+1; j++ ) {
				System.out.print("*");
			}
			for(int j = 1; j<i; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {

		InvertedStarTriangle IST = new InvertedStarTriangle();
		IST.PrintTriangle(4);
	}
}


/* 
   
*******   i=1 stars = 7 spaces =0   Stars = (n-i)*2+1
 *****    i=2 stars = 5 spaces =2   
  ***     i=3 stars = 3 spaces =4   
   *      i=4 stars = 1 spaces =6
 
 */