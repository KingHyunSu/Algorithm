package algo;
import java.util.Scanner;

public class linearSearch {

	static int seqSearch(int[] a, int n, int key) {
		
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i<num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		System.out.println("검색할 값:");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("검색 실패");
		}else {
			System.out.println(idx);
		}

	}

}
