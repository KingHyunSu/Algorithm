package algo;

import java.util.HashMap;
import java.util.Map;

public class Programmers42576 {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "mislav", "ana"};
		
		String notRunner = "";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String runner : participant) {
			map.put(runner, map.getOrDefault(runner, 0) + 1);
			System.out.println(map);
		}
		
		for(String runner : completion) {
			map.put(runner, map.get(runner) -1);
		}

		for(String runner : map.keySet()) {
			if(map.get(runner) != 0) {
				notRunner = runner;
			}
		}
		System.out.println(notRunner);
	}
}
