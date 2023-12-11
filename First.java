package exercises;

import java.util.Scanner;

public class First {
	
	/*Write a program that gets from the user 2 numbers and displays their division
	 * and remainder.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Type the number one:");
		double first = sc.nextDouble();
		System.out.println("Type the number two:");
		double second = sc.nextDouble();
		
		System.out.println(first/second);
		System.out.println(first%second);
		
		
		sc.close();

	}

}