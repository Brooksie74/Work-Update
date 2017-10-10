package basic1;

public class SumAllTheElementsInAnArray {

	public static void main(String[] args) {
		
		int[] numberList = { 1, 2, 3, 4 };
		 
		 		int sum = 0;
		 		for (int number : numberList) {
		 			// sum += number;(short and nifty version)
		 			sum += number;
		 
		 		}
		 
		 		System.out.println("The sum of elements is " + sum);

	}

}
