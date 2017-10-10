package basic1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		 int a, b;
	      System.out.println("Enter an integer to print it's multiplication table");
	      Scanner in = new Scanner(System.in);
	     
	      a = in.nextInt();
	      System.out.println("Multiplication table of "+a+" is :-");
	 
	      for ( b = 1 ; b <= 10 ; b++ )
	         System.out.println(a+"*"+b+" = "+(a*b));
	}

}
