package algo;

import java.util.Arrays;
import java.util.Collections;

public class Programmers42577 {
	public static void main(String[] args) {
		String[] phoneNum = {"123","456","789"};
		
		boolean result = true;
		
		Arrays.sort(phoneNum);
		
		for(int i = 0; i < phoneNum.length-1; i++) {
			System.out.println(phoneNum[i]);
				if(phoneNum[i+1].startsWith(phoneNum[i])) {
					result = false;
					System.out.println(phoneNum[i]);
			}
		}
		System.out.println(result);
		
	}
}
