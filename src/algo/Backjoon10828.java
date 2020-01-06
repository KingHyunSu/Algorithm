package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backjoon10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		Stack<Integer> stackList = new Stack<Integer>();
		
		for(int i = 0; i < num; i++) {
			String input = br.readLine();
			String[] inputArr = input.split(" ");
			
			if(inputArr[0].equals("push")) {
				stackList.push(Integer.parseInt(inputArr[1]));
				inputArr = null;
			}else if(inputArr[0].equals("pop")){
				if(stackList.empty()) {
					System.out.println("-1");
					inputArr = null;
				}else {
					System.out.println(stackList.peek());
					stackList.pop();
					inputArr = null;
				}
			}else if(inputArr[0].equals("size")) {
				System.out.println(stackList.size());
				inputArr = null;
			}else if(inputArr[0].equals("empty")) {
				if(stackList.empty()) {
					System.out.println("1");
					inputArr = null;
				}else {
					System.out.println("0");
					inputArr = null;
				}
			}else if(inputArr[0].equals("top")) {
				if(stackList.empty()) {
					System.out.println("-1");
					inputArr = null;
				}else {
					System.out.println(stackList.peek());
					inputArr = null;
				}
			}
		}
	}

}
