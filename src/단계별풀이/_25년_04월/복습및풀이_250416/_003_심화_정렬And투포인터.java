package 단계별풀이._25년_04월.복습및풀이_250416;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _003_심화_정렬And투포인터 {
	public static void main(String[] args) {
		//정답
		int[] nums = {3, 5, 1, 2, 4};
		int target = 7;

		Arrays.sort(nums); // 정렬이 핵심
		int i = 0;
		int j = nums.length - 1;

		List<String> list = new ArrayList<>();

		while(i < j){
			int sum = nums[i] + nums[j];
			if(sum < target){
				// i와 j 사이의 모든 쌍이 가능 → i 고정, j는 i+1 ~ j
				for(int k = j; k > i; k--){
					list.add("{" + nums[i] + "," + nums[k] + "}");
				}
				i++; // 다음 i로 이동
			} else {
				j--; // sum >= target이면 j를 줄인다
			}
		}

		System.out.println(list.toString());
	}
	static void fail(){
		/**
		 * 목표
		 * 두 쌍의 합이 target 미만인 경우의 수를 세어보자
		 * 단, i < j 조건 만족
		 */

		int[] nums = {3, 5, 1, 2, 4};
		int target = 7;

		int i = 0;
		int j = nums.length-1;

		System.out.println("i : "+i);
		System.out.println("j : "+j);

		Arrays.sort(nums);

		boolean isOver = true;
		List<String> list = new ArrayList<>();

		//
		while(i < j){
			System.out.println("    i : "+i);
			System.out.println("    j : "+j);
			int sum = nums[i] + nums[j];
			System.out.println("    sum : "+sum);
			System.out.println();
			// x + y 의 합이 타겟 미만일 경우
			if(sum < target){
				StringBuilder sb = new StringBuilder();
				sb.append("{").append(nums[i]).append(",").append(nums[j]).append("}");
				list.add(sb.toString());
				j--;
				// ❌ 여기서 j만 줄이니까 같은 i로 계속 돌게 됨
			}
			// 같거나 이상일 경우
			else if(sum <= target){
				// ❌ sum < target 인데 또 <= target 처리 중복됨
				j =nums.length-1;
				i++;
			}
		}

		System.out.println(list.toString());
	}
}
