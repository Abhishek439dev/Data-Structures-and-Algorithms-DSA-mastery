package com;

public class StarPatternMethod {

	public void PrintStarPattern(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		StarPatternMethod SPM = new StarPatternMethod();
		SPM.PrintStarPattern(4);
	}
}
