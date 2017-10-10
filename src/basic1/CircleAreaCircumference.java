package basic1;

import java.util.Scanner;

public class CircleAreaCircumference {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter radius: ");
		 		
		double radius = new Scanner(System.in).nextDouble();
		 
		 		System.out.println("The area is " + calculateArea(radius));
		 		System.out.println("The circumference is " + calculateCircumference(radius));
		 
		 	}
		 
		 	static double calculateCircumference(double radius) {
		 
		 		return 2 * Math.PI * radius;
		 	}
		 
		 	static double calculateArea(double radius) {
		 		return radius * radius * Math.PI;

	}

}
