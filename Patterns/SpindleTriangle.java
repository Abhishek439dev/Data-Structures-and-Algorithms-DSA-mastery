package com;

public class SpindleTriangle {
//This program prints a spindle or starshaped pattern of *.
// We can create it in two parts the first half loop prints the upper half 
//and the other half of code prints the remaining half of pattern.
    //This function prints the pattern.
  void PrintTriangle(int n) {
		//This set of loop prints upper half
		for(int i = 1; i<=n; i++) {
			
			for(int j = 1; j<=(n-i); j++) {    //First inner loop: Prints spaces.
				System.out.print(" ");
			}
			for(int j = 1; j<=(i*2)-1; j++ ) {  //Second inner loop: Print stars
				System.out.print("*");
			}
			for(int j = 1; j<=(n-i); j++) {   //Third inner loop: Prints spaces.
				System.out.print(" ");
			}
			
			System.out.println();
		}

	    //This set of loop prints lower half
		for(int i = 1; i<=n; i++) {  //Outer loop: determines number of lines
			
			for(int j = 1; j<i; j++) { //First inner loop: Print spaces.
				System.out.print(" ");
			}
			for(int j = 1; j<=((n-i)*2)+1; j++ ) { //Second inner loop: Print stars
				System.out.print("*");
			}
			for(int j = 1; j<i; j++) { //Third inner loop: Prints spaces.
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

 public static void main(String[] args) {
	 SpindleTriangle ST = new SpindleTriangle(); //Object creation 
	 ST.PrintTriangle(4); //Method called.
}
}





/*   
   *      i=1 stars = 1 spaces =6
  ***     i=2 stars = 3 spaces =4
 *****    i=3 stars = 5 spaces =2
*******   i=4 stars = 7 spaces =0
*******   i=5 stars = 7 spaces =0   Stars = (n-i)*2+1
 *****    i=6 stars = 5 spaces =2   
  ***     i=7 stars = 3 spaces =4   
   *      i=8 stars = 1 spaces =6
   
*/
