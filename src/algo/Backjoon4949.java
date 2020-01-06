package algo;
import java.util.EmptyStackException;
import java.util.Stack;

public class Backjoon4949 {
	public static void main(String[] args){
		
		String test = "So when I die (the [first] I will see in (heaven) is a score list)." + 
				"[ first in ] ( first out )." + 
				"Half Moon tonight (At least it is better than no Moon at all]." + 
				"A rope may form )( a trail in a maze.\n" + 
				"Help( I[m being held prisoner in a fortune cookie factory)]." + 
				"([ (([( [ ] ) ( ) (( ))] )) ])." + 
				" .\n" + 
				".";

		Stack<Character> stackList1 = new Stack<Character>();
		Stack<Character> stackList2 = new Stack<Character>();
		
		for(int i = 0; i < test.length(); i++) {
			if(test.charAt(i) == '(') {
				stackList1.push(test.charAt(i));
			}
			try {
				if(test.charAt(i) == ')') {
					if(stackList1.peek() == '(') {
						stackList1.pop();
					}
				}
			}catch (Exception e) {
				
			}
			
			if(test.charAt(i) == '[') {
				stackList2.push(test.charAt(i));
			}
			try {
				if(test.charAt(i) == ']') {
					if(stackList2.peek() == '[') {
						stackList2.pop();
					}
				}
			}catch (Exception e) {
				
			}

			
			if(test.charAt(i) == '.') {
				if(stackList1.empty() && stackList2.empty()) {
					System.out.println("true");
				}else{
					System.out.println("false");
				}
				stackList1.clear();
				stackList2.clear();
			}
		}

	}
}
