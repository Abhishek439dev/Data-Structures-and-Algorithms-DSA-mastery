package com;

import java.util.Scanner;

public class StarPattern {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print the pattern");
		int N = scan.nextInt();
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
