package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Backjoon2798 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int num = Integer.parseInt(br.readLine());
		
		int tot = Integer.parseInt(br.readLine());
		
		int[] arr = new int[num];
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int val = Integer.parseInt(br.readLine());
			arr[i] = val;
		}
		for(int i = 0; i < arr.length-2; i++) {
			int threeTot = 0;
			
			for(int j = i; j < i+3; j++) {
				threeTot += arr[j];
			}
			
			list.add(threeTot);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
