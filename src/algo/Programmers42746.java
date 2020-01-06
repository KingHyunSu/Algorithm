package algo;

import java.util.Arrays;
import java.util.Collections;

public class Programmers42746 {
	public static void main(String[] args) {
		int[] numbers = {6,10,2};
		String[] strNum = new String[numbers.length];
		
		for(int i = 0; i < numbers.length-1; i++) {
			String a = String.valueOf(numbers[i]);
			for(int j = i+1; j < numbers.length; j++) {
				String b = String.valueOf(numbers[j]);
				
				strNum[i] = a.concat(b);
			}
		}

		for(int i = 0; i < strNum.length; i++) {
			System.out.println(strNum[i]);
		}
	}
}
