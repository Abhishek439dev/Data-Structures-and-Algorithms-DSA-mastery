package com;

public class InvertedStarTriangle {

void PrintTriangle(int n) {
		
		for(int i = 1; i<=n; i++) { //outer loop determines number of lines (n).
			
			for(int j = 1; j<i; j++) { //first inner loop to print space. the space loop should run for (i-1) times means one time less than i hence, j<i logic is used.
				System.out.print(" ");
			}
			for(int j = 1; j<=((n-i)*2)+1; j++ ) {  //Second inner loop printing stars. Stars = (n-i)*2+1 ex: [(4-1)*2]+1 = 6+1 = 7, [(4-2)*2]+1= 4+1 = 5 etc
				System.out.print("*");
			}
			for(int j = 1; j<i; j++) {  //third inner loop to print space.
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
   
*******   i=1 stars = 7 spaces =0   Stars = (n-i)*2+1 ex: [(4-1)*2]+1 = 6+1 = 7, [(4-2)*2]+1= 4+1 = 5 etc.
 *****    i=2 stars = 5 spaces =2   Spaces = When i =1 space =0 when i = 2 space = 1 (on each side). Thus to print spaces we can just use j<i so that the space loop 
  ***     i=3 stars = 3 spaces =4    will run one time less than the value of i.
   *      i=4 stars = 1 spaces =6
 
 */
