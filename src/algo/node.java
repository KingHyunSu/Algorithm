package algo;

import java.util.HashMap;
import java.util.Map;

public class node {
//	public String solution(String[] participant, String[] completion) {
//		String notRunner = "";
//		
//		HashMap<String, Integer> map = new HashMap<String, Integer>(); // @1
//		
//		for(String runner : participant) {
//			map.put(runner, map.getOrDefault(runner, 0) + 1); // @2
//		}
//		map.
//		for(String runner : completion) {
//			map.put(runner, map.get(runner) - 1); // @3
//		}
//		
//		for(String runner : map.keySet()) {
//			if(map.get(runner) != 0) {
//				notRunner = runner; // @4
//				break;
//			}
//		}
//		
//		return notRunner;
//	}
	public static void main(String[] args) {
		String[] arr1 = {"mislav", "stanko", "mislav", "ana"};
		String[] arr2 = {"stanko", "ana", "mislav"};

		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String a : arr1) {
			map.put(a, map.getOrDefault(a, 0) + 1);
			System.out.println(map);
		}
		System.out.println(map);
	}
}