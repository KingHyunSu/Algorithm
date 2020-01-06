package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers42748 {
	public static void main(String[] args) {
		int[] arr = {1,5,2,6,3,7,4};
		int[][] val = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = new int[val.length];
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < val.length; i++) {
			int first = val[i][0]-1;
			int end = val[i][1]-1;
			int k = val[i][2]-1;
			
			for(int j = first; j <= end; j++) {
				list.add(arr[j]);
			}
			Collections.sort(list);
			result[i] = list.get(k);
			list.clear();
		}

		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
