package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Backjoon2309 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tot = 0;
		int[] human = new int[9];
		
		for(int i = 0; i < human.length; i++) {
			int num = Integer.parseInt(br.readLine());
			tot += num;
			human[i] = num;
		}
		System.out.println("tot : " + tot);
		//난쟁이의 키는 0일 수가 있나?
		System.out.println("size :" + human.length);
		int result = 0;
		for(int i = 0; i < human.length-1; i++) {
			for(int j = i+1; j < human.length; j++) {
				if(human[i] > 0 && human[j] > 0) {
					result = Math.abs(tot-(human[i]+human[j]));
					System.out.println("result i : " + result);
					if(result == 100) {
						System.out.println("result j : " + result);
						human[i] = -1;
						human[j] = -1;
						break;
					}
				}
			}
			//2번째 for문에서 break거니깐 2번째만 빠져나와서 한번 더 돌아버려서 에러 났었음
			if(result == 100) {
				break;
			}
		}
		
		Arrays.sort(human);
		
		for(int i = 0; i < human.length; i++) {
			if(human[i] > -1) {
				System.out.println(human[i]);
			}
		}
	}
}
