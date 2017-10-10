package basic1;

public class No14 {

	public static void main(String[] args) {
		
	}	
		public boolean no14(int[] nums) {
		    int ones = 0;
		    int fours = 0;
		    for (int i = 0; i < nums.length; i++) {
		        if (nums[i] == 1) ones++;
		        if (nums[i] == 4) fours++;
		    }
		    return ones == 0 || fours == 0;

	}

}
