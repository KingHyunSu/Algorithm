package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon9325 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			int price = Integer.parseInt(br.readLine());

			int num2 = Integer.parseInt(br.readLine());
			for(int j = 0; j < num2; j++) {
				String option = br.readLine();
				
				String[] qp = option.split(" ");
				
				price += Integer.parseInt(qp[0]) * Integer.parseInt(qp[1]);
				
			}
			System.out.println(price);
		}
	}
}
