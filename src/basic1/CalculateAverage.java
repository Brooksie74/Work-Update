package basic1;

import java.util.Scanner;

public class CalculateAverage {

	

	 static void main(String[] args) {

		 System.out.println("Please enter number1: ");
		 		int number1= new Scanner(System.in).nextInt();
		 
		 		System.out.println("Please enter number2: ");
		 		int number2 = new Scanner(System.in).nextInt();
		 
		 		System.out.println("Please enter number3: ");
		 		int number3 = new Scanner(System.in).nextInt();
		 
		 		System.out.println("Please enter number4: ");
		 		int number4 = new Scanner(System.in).nextInt();
		 
		 		System.out.println("Please enter number5: ");
		 		int number5 = new Scanner(System.in).nextInt();
		 
		 		System.out.println("The average is " + calculateAverage(number1, number2, number3, number4, number5));
		 
		 	}
		 
		 	static int calculateAverage(int number1, int number2, int number3, int number4, int number5) {
		 
		 		return (number1 + number2 + number3 + number4 + number5) / 5;
	
	 }	
	 
	 
}