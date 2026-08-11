package com;

public class UprightStarTriangle {

	void PrintTriangle(int n) {
		
		for(int i = 1; i<=n; i++) {
			
			for(int j = 1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=(i*2)-1; j++ ) {
				System.out.print("*");
			}
			for(int j = 1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {

		UprightStarTriangle UST = new UprightStarTriangle();
		UST.PrintTriangle(4);
	}
}




/*   
    *      i=1 stars = 1 spaces =6
   ***     i=2 stars = 3 spaces =4
  *****    i=3 stars = 5 spaces =2
 *******   i=4 stars = 7 spaces =0
 */
