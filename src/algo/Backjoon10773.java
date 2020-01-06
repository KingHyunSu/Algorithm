package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backjoon10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		Stack<Integer> stackList = new Stack<Integer>();
		
		for(int i = 0; i < num; i++) {
			int val = Integer.parseInt(br.readLine());
			
			if(val > 0) {
				stackList.push(val);
			}else if(val == 0){
				stackList.pop();
			}
		}
		
		int tot = 0;
		for(int i = 0; i < stackList.size(); i++) {
			tot += stackList.get(i);
		}
		
		System.out.println(tot);
	}

}
