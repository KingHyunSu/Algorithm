package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backjoon9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		Stack<Character> stackList = new Stack<Character>();
		
		for(int i = 0; i < num; i++) {
			String val = br.readLine();
			
			boolean result = true;
			
			for(int j = 0; j < val.length(); j++) {
				if(val.charAt(j) == '(') {
					stackList.push(val.charAt(j));
				}else if(val.charAt(j) == ')'){
					if(!stackList.empty()) {
						stackList.pop();
					}else {
						result = false;
						break;
					}
				}

			}
			if(stackList.size()!=0) {
				result = false;
			}

			stackList.clear();
			
			if(result == false) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}
}
