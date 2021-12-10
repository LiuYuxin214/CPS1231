import java.util.*;
public class LargestNum {

	public static int findLargestNum(int[] nums){
		int length=nums.length;
		int temp,result = 0;
		int times=0;
		for(int i=0;i<length;i++) {
			temp = nums[i];
			times=0;
			for(int j=0;j<length;j++) {
				if(temp<nums[j]) break;
				times++;
				if(times==length) result = temp;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] n = new int[5];
		for(int i=0;i<5;i++) {
			n[i]=input.nextInt();
		}
		int max = findLargestNum(n);
		System.out.println(max);
	}

}
