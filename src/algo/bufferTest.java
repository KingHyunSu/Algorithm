package algo;
import java.util.Scanner;

public class bufferTest {

	public static void main(String[] args){
		
        Scanner sc = new Scanner(System.in);
        int limit = Integer.parseInt(sc.nextLine());
        String[] strNums = sc.nextLine().split(" ");
        int[] nums = new int[limit];
        for (int i = 0; i < strNums.length ; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }
        int max = nums[0];
        int min = nums[0];
        for (int i: nums) {
            if(max < i){
                max = i;
            }
            if(min > i){
                min = i;
            }
        }
        System.out.printf("%d %d\n", min,max);
    }

}
