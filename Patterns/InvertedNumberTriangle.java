package com;

public class InvertedNumberTriangle {

	void PrintUprightTriangle(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 1; j<(n-i)+1; j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		InvertedNumberTriangle UNT = new InvertedNumberTriangle();
		UNT.PrintUprightTriangle(5);
	}
}
