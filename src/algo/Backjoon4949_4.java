package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Backjoon4949_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String val = br.readLine();
			
			//while문 돌때마다 스택 배열 생성
			Stack<Character> stackList = new Stack<Character>();
			
			// .(dot)만 나온다면 종료
			if(val.equals(".")) {
				bw.flush();
				br.close();
				bw.close();
				break;
			}
			
			boolean result = true;
			
			for(int i = 0; i < val.length(); i++) {
				if(val.charAt(i)=='(' || val.charAt(i)=='[') {
					stackList.push(val.charAt(i));
				}else if(val.charAt(i) == ')') {
					if(stackList.isEmpty() || stackList.peek() != '(') {		//스택이 비어있거나, top이 '('이 아니면 no
						result = false;
						break;
					}else {
						stackList.pop();
					}
				}else if(val.charAt(i) == ']') {
					if(stackList.isEmpty() || stackList.peek() != '[') {		//스택이 비어있거나, top이 '('이 아니면 no
						result = false;
						break;
					}else {
						stackList.pop();
					}
				}
			}
			if(!stackList.isEmpty()) {	//스택이 비어있지 않으면 no
				result = false;
			}
			if(result == true) {
				bw.write("yes\n");
			}else {
				bw.write("no\n");
			}
		}
	}
}
