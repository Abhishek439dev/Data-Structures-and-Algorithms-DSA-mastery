package com;

public class InvertedNumberTriangle {

	void PrintUprightTriangle(int n) {
		for(int i = 0; i<n; i++) {           //outer loop determines number of lines of triangle.
			for(int j = 1; j<=(n-i); j++) {  //inner loop print lines: It should run for a total of n-i times 
				System.out.print(j);         //printing value of j
			}
			System.out.println();  //new line.
			
		}
	}
	
	public static void main(String[] args) {
		InvertedNumberTriangle UNT = new InvertedNumberTriangle();
		UNT.PrintUprightTriangle(5);
	}
}

/*

12345 i=0  j <= (n-i) ex: 5-0 = 5. The loop will run for 5 times and with the increase in value of i this iteration will decrease.
1234  i=1  j <= (n-i) ex: 5-1 = 4. The loop will run for 4 times
123   i=2  j <= (n-i) ex: 5-2 = 3. The loop will run for 3 times
12    i=3  j <= (n-i) ex: 5-3 = 2. The loop will run for 2 times
1     i=4  j <= (n-i) ex: 5-4 = 1. The loop will run for 1 times

*/
