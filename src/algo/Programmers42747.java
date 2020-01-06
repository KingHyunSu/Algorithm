package algo;

import java.util.Arrays;
import java.util.Collections;

public class Programmers42747 {
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		
		int answer = 0;
		int tot = 0;
		
		for(int i = 0; i < citations.length; i++) {
			tot += citations[i];
		}
		
		int avg = tot/citations.length;
		
		for(int i = 0; i < citations.length; i++) {
			if(citations[i] >= avg) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
