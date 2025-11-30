package old.단계별풀이_old._25년_04월.복습및풀이_250416;

import java.util.Arrays;

public class _005_심화응용_투포인터And정렬 {
	public static void main(String[] args) {
		// 오름차순으로 정렬된 배열 nums와 정수 target이 주어진다.
		// 두 수를 더해 target이 되는 인덱스를 반환하라.
		// 단, 인덱스는 0-based가 아니라 1-based로 리턴한다.]

		int[][] task = {{2, 7, 11, 15},{1, 2, 3, 4, 6}};
		int[] nums = {9,10};
		for(int i = 0; i < 2; i++){
			System.out.println(Arrays.toString(twoSum(task[i],nums[i])));
		}


	}
	public static int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length-1;
		int[] answer = new int[2];
		while(i < j){
			int sum = numbers[i] + numbers[j];
			System.out.println("    sum : "+sum);
			if(sum <= target){
				for(int k = j; k > i;k--){
					System.out.println("        k : "+k);
					System.out.println("        temp : "+numbers[k]);
					int tmp = numbers[k];
					int sum2 = tmp + numbers[i];
					System.out.println("        sum2 : "+sum2);
					if(sum2 == target){
						answer[0] = Math.min(numbers[i],numbers[k]);
						answer[1] = Math.max(numbers[i],numbers[k]);
					}
				}
				i++;
			}else{
				j--;
			}
		}

		return answer;
	}
}
