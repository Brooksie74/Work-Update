package basic1;

import java.util.Scanner;


public class UpperCase {

	
		 
			 
		 public static char toUpperCase(char ch) { 
			 Character.isUpperCase(ch);
			 return ch -= 32;
		 }
		   public static void main(String[] args) {
			   Scanner input = new Scanner (System. in);
			   
			         System.out.println("Enter a lowercase letter: ");
			   
			         char lowerc = input.next().charAt(0);
			   
			         System.out.println(toUpperCase(lowerc));

		   }
		      
			   
			       
			       }
			      

	


