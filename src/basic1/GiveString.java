package basic1;

public class GiveString {

	public String firstTwo(String str)
	
	{

		if(str.length() >= 3)
			return str.substring(0, 2);
		return str;

	}

}
