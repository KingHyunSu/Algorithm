package algo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Backjsson4949_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();
		StringTokenizer test = new StringTokenizer(s);

		System.out.println(test);
		Stack<Character> stackList = new Stack<Character>();

		
//		for(int i = 0; i < list.length; i++) {
//			for(int j = 0; j < list[i].length(); j++) {
//				if(list[i].charAt(j) == '(' || list[i].charAt(j) == '[') {
//					stackList.push(list[i].charAt(j));
//				}
//				if(list[i].charAt(j) == ')') {
//					try {
//						if(stackList.peek() == '(') {
//							stackList.pop();
//						}
//					}catch(Exception e) {
//						
//					}
//				}
//				if(list[i].charAt(j) == ']') {
//					try {
//						if(stackList.peek() == '[') {
//							stackList.pop();
//						}
//					}catch(Exception e) {
//						
//					}
//				}
//			}
//			
//			if(stackList.empty()) {
//				System.out.println("yes");
//			}else {
//				System.out.println("no");
//			}
//			stackList.clear();
//
//		}
	}
}
