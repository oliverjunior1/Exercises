package javaExercises;

import java.util.Scanner;

public class Second {
	/*Write a program that gets from the user the radius and print the area and perimeter
	of a circle.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the radius for calculate:");
		double radius = sc.nextDouble();
		double field = Math.PI*(radius*radius);
		double perimeter = 2*Math.PI*radius;
		
		System.out.printf("The field of the circle is: %.2f", field);
		System.out.println();
		System.out.printf("The perimeter of the circle is: %.2f", perimeter);
		
		
		
		System.out.println();
		
		
		sc.close();

	}

}
