package algo;
import java.util.ArrayList;
import java.util.List;

public class Backjoon4673 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10000; i++) {
			list.add(i);
		}
		
		
		for(int i = 0; i < list.size(); i++) {
//			System.out.println(i+(i/10)+(i%10));
			for(int j = 0; j < list.size(); j++) {
				if(i <= 10) {
					if(i+i == list.get(j)) {
						list.remove(j);
					}
					
					
				}else if(i <= 100) {
					if(i+(i/10)+(i%10) == list.get(j)) {
						
						list.remove(j);
					}
				}
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
