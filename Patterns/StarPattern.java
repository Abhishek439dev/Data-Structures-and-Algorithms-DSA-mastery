package com;

import java.util.Scanner;
//This program takes a number from user as input and prints a n*n star pattern.
public class StarPattern {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print the pattern");  //prompt
		int N = scan.nextInt();  //storing input
		
		for(int i = 0; i<N; i++) {  //outer loop - determines number of lines.
			for(int j = 0; j<N; j++) {  //Inner loop - prints each line.
				System.out.print("*");  //print statement(same line)
			}
			System.out.println();   //empty println statement to shift to next line.
		}
		scan.close();   //closing taking inputs.
	}
}
