package com;

public class SameNoTriangle {

		public void PrintSameNumberTriangle(int n) {
			
			for(int i = 1; i<=n; i++) {
				for(int j = 1; j<=i; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
			
		}
		public static void main(String[] args) {
			SameNoTriangle NT = new SameNoTriangle();
			NT.PrintSameNumberTriangle(4);
		}
	}


