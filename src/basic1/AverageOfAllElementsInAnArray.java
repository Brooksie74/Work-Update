package basic1;

public class AverageOfAllElementsInAnArray {

	public static void main(String[] args) {
		
		int[] numbers = new int[]{1,2,3,4};
       
       int sum = 0;
       
        for(int i=0; i < numbers.length ; i++)
                sum = sum + numbers[i];
       
       double average = sum / numbers.length;
       
        System.out.println("Average value of all elements is : " + average);
}
}
