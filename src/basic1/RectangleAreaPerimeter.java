package basic1;

import java.util.Scanner;

public class RectangleAreaPerimeter {

	public static void main(String[] args) {
		
		System.out.println("Please enter height: ");
		 		
		double height = new Scanner(System.in).nextDouble();
		 
		 		System.out.println("Please enter width: ");
		 		double width = new Scanner(System.in).nextDouble();
		 
		 		System.out.println("The area of rectangle is " + calculateArea(height, width));
		 		System.out.println("The perimeter of rectangle is " + calculatePerimeter(height, width));
		 
		 	}
		 
		 	static double calculateArea(double height, double width) {
		 		return height * width;
		 	}
		 
		 	static double calculatePerimeter(double height, double width) {
		 		return 2 * (height + width);
		

	}

}
