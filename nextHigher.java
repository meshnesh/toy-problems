package toys;

import java.util.Arrays;

public class nextHigher {

	public static void main(String[] args) {
		int number = 2015;
		
		char [] chars = String.valueOf(number).toCharArray();
		Arrays.sort(chars);
		System.out.println();
		for(int i = chars.length-1; i>= 0; i--){
			System.out.print(chars[i]);
		}

	}

}
