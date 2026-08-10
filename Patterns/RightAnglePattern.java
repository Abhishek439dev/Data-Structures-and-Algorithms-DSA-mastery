package com;

public class RightAnglePattern {

	public void PrintRightAngleTriangle(int n) {
		for (int i = 0; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		RightAnglePattern RAP = new RightAnglePattern();
		RAP.PrintRightAngleTriangle(10);
	}
}
