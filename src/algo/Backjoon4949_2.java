package algo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Backjoon4949_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		Stack<Character> stackList = new Stack<Character>();
		
		while(true) {
			
			
			String test = br.readLine();

			if(test.charAt(0) != '.'){			
				for(int i = 0; i < test.length(); i++) {
					if(test.charAt(i) == '(' || test.charAt(i) == '[') {
						stackList.push(test.charAt(i));
					}
					if(test.charAt(i) == ')') {
							if(stackList.empty()) {
								break;
							}
							else if(stackList.peek() == '(') {
								stackList.pop();
							}else {
								continue;
							}
					}
					else if(test.charAt(i) == ']') {
							if(stackList.empty()) {
								break;
							}
							else if(stackList.peek() == '[') {
									stackList.pop();
							}else {
								continue;
							}
					}
					else if(test.charAt(i) == '.') {
						if(!stackList.empty()) {
							bw.write("no\n");
						}else {
							bw.write("yes\n");
						}
						stackList.clear();
						break;
					}
				}	
			}else {
				break;
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
