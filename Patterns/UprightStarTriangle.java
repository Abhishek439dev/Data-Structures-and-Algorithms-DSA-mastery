package com;

public class UprightStarTriangle {

	void PrintTriangle(int n) {
		//Outer loop determines the number of lines to be print it is equal to n.
		for(int i = 1; i<=n; i++) {
			//There are three inner loops.
			for(int j = 1; j<=(n-i); j++) {   //First loop to add spaces before printing stars.
				System.out.print(" ");
			}
			for(int j = 1; j<=(i*2)-1; j++ ) {  //Second one to print stars. The logic to print stars is (i*2)-1
				System.out.print("*");
			}
			for(int j = 1; j<=(n-i); j++) {  //Third one also prints spaces. 
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
    *      i=1 stars = 1 spaces =6  Stars = 2i-1 ex: 2*1-1 = 1, 2*3-1 = 5 stars etc.
   ***     i=2 stars = 3 spaces =4  Spaces = n-i ex: 4-1 = 3 spaces, 4-2 = 2 spaces etc.
  *****    i=3 stars = 5 spaces =2
 *******   i=4 stars = 7 spaces =0
 */
