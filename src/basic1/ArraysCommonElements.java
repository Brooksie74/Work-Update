package basic1;

public class ArraysCommonElements {

	public static void main(String[] args) {
		
		int[] array1 = {1,3,5};
		int[] array2 = {2,4,5};

	for(int i = 0; i<array1.length; i++) {
		for(int j = 0; j<array2.length; j++) {
	
			if(array1[i] == array2[j]) {
				System.out.println(array1[i]);
			}
		}
	}

}
}