package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Backjoon4949_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		Stack<Character> stackList = new Stack<Character>();
		
		while(true) {
			
			String val = br.readLine();
			
			int result = 0;
			
			if(val.equals(".")) {
				br.close();
				bw.close();
				break;
			}else {
				for(int i = 0; i < val.length(); i++) {
					
					if(val.charAt(i) == '(' || val.charAt(i) == '[') {
						result++;
						stackList.push(val.charAt(i));
					}
					if(val.charAt(i) == ')') {
						if(stackList.empty()) {
							result = -1;
							break;
						}else if(stackList.peek() == '(') {
							stackList.pop();
							result--;
						}else {
							continue;
						}
					}else if(val.charAt(i) == ']') {
						if(stackList.empty()) {
							result = -1;
							break;
						}else if(stackList.peek() == '[') {
							stackList.pop();
							result--;
						}else {
							continue;
						}
					}else if(val.charAt(i) == '.') {
						if(result == 0) {
							bw.write("yes\n");
							bw.flush();
						}else {
							bw.write("no\n");
							bw.flush();
						}
						stackList.clear();
						break;
					}
				}
			}
		}
	}
}
