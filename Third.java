package javaExercises;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		
		//Write a program to convert a decimal number to a binary number. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to convert to Binary: ");
		
		int decimal = sc.nextInt();
		String binary = Integer.toBinaryString(decimal);
		
		System.out.println("The Integer change to binary is: " + binary);
		
		
		sc.close();
	}

}