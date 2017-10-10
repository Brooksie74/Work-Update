package basic1;

import java.util.Collections;

import java.util.List;


public class StringTimes {

	public static void main(String[] args) {
		
		List list = Collections.nCopies(2, "Hi");
		
		List list1 = Collections.nCopies(3, "Hi");
		
		List list2 = Collections.nCopies(1, "Hi");
		
		System.out.println(list);
		System.out.println(list1);
		System.out.println(list2);
		
		
		}

}
